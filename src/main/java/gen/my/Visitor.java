package gen.my;

import gen.GrammaBaseVisitor;
import gen.GrammaParser;
import gen.my.base.Base;
import gen.my.expressions.*;
import gen.my.expressions.Math;
import gen.my.expressions.Number;
import gen.my.statements.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Visitor extends GrammaBaseVisitor<Base> {

    private static int count = 0;

    private static final TreeMap<String, Map<String, String>> varTable = new TreeMap<>();
    private static final Map<String, String> varsMemory = new HashMap<>();
    private static final Map<String, List<Parameter>> functionParamsMemory = new HashMap<>();
    public static List<String> code = new ArrayList<>();

    @Override
    public Base visitNum(GrammaParser.NumContext ctx) {
        Number a;
        if (ctx.NUM() != null) {
            a = new Number(ctx.NUM().getText());
        }
        else {
            a = new Number(ctx.dbl().getText());
        }

        return a;
    }

    @Override
    public Base visitDbl(GrammaParser.DblContext ctx) {
        return new Number(ctx.NUM(0).getText(), ctx.NUM(1).getText());
    }


    @Override
    public Base visitMulDiv(GrammaParser.MulDivContext ctx) {
        Math math;
        if (ctx.operation.getType() == GrammaParser.MULT) {
            math = new Math("mult", (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }
        else {
            math = new Math("div", (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }

        return math;
    }

    @Override
    public Base visitPlusMinus(GrammaParser.PlusMinusContext ctx) {
        Math math;
        if (ctx.operation.getType() == GrammaParser.PLUS) {
            math = new Math("plus", (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }
        else {
            math = new Math("minus", (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }

        return math;
    }

    @Override
    public Base visitParens(GrammaParser.ParensContext ctx) {
        return new Parens((Expression) visit(ctx.expression()));
    }

    @Override
    public Base visitId(GrammaParser.IdContext ctx) {
        return new NameAndValue(ctx.identifier().NAME().getText(), ctx.identifier().NUM().getText());
    }

    @Override
    public Base visitVarEqlsFunc(GrammaParser.VarEqlsFuncContext ctx) {

        checkForLegalVar(ctx.NAME().getText());
        if (ctx.expression() == null) {
            return new NameAndValue(ctx.NAME().getText(), visit(ctx.function_call()).toString());
        }
        else {
            return new NameAndValue(ctx.NAME().getText(), visit(ctx.expression()).toString());
        }

    }

    @Override
    public Base visitIdentifier(GrammaParser.IdentifierContext ctx) {
        return new NameAndValue(ctx.NAME().getText(), ctx.NUM().getText());
    }

    @Override
    public Base visitDefineVar(GrammaParser.DefineVarContext ctx) {

        String currType = ctx.TYPE().getText();
        String name, value = null;

        if (ctx.identifier() != null && ctx.identifier().function_call() == null) {
            name = ctx.identifier().NAME().getText();
            value = ctx.identifier().NUM().getText();
        }
        else if(ctx.identifier() != null && ctx.identifier().function_call() != null) {
            name = ctx.identifier().NAME().getText();
            value = ctx.identifier().function_call().getText();
        }
        else {
            name = ctx.NAME().getText();
        }

        if (ctx.expression() != null && ctx.expression().getChild(0) instanceof GrammaParser.DblContext) {
            if (!currType.equals("Float")) {
                try {
                    throw new Exception("illegal var type");
                }
                catch (Exception e) {
                    e.printStackTrace();
                    Walker.setErrors(true);
                }
            }
            value = visit(ctx.expression().getChild(0)).toString();
        }
        else if(ctx.expression() != null) {
            value = visit(ctx.expression()).toString();
        }

        varsMemory.put(name, currType);
        DefineVar defineVar = new DefineVar(ctx.TYPE().getText(), new NameAndValue(name,value));

        if (ctx.expression() != null) {
            visit(ctx.expression());
        }

        return defineVar;
    }

    @Override
    public Condition visitCompare(GrammaParser.CompareContext ctx) {
        checkForLegalVar(ctx.expression(0).getChild(0).getText());

        return new Condition(visit(ctx.expression(0)).toString(),
                ctx.operation.getText(),visit(ctx.expression(1)).toString());
    }

    @Override
    public Base visitIf_rule(GrammaParser.If_ruleContext ctx) {
        List<Base> statements = new ArrayList<>();

        String s = ctx.expression().getChild(0).getText();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);

        if (!matcher.find()) {
            checkForLegalVar(ctx.expression().getChild(0).getText());
        }

        s = ctx.expression().getChild(2).getText();
        matcher = pattern.matcher(s);

        if (!matcher.find()) {
            checkForLegalVar(ctx.expression().getChild(2).getText());
        }

        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                statements.add(visitStatement_rules(ctx.statement(i).statement_rules(j)));
            }
        }

        if (ctx.else_rule() != null) {

            return new IfStatement(new Condition(ctx.expression().getChild(0).getText(),
                            ctx.expression().getChild(1).getText(), ctx.expression().getChild(2).getText()),
                            statements, visitElse_rule(ctx.else_rule()));
        }
        return new IfStatement(new Condition(ctx.expression().getChild(0).getText(),
                        ctx.expression().getChild(1).getText(), ctx.expression().getChild(2).getText()),
                statements);
    }

    @Override
    public ElseStatement visitElse_rule(GrammaParser.Else_ruleContext ctx) {
        List<Base> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                statements.add(visitStatement_rules(ctx.statement(i).statement_rules(j)));
            }
        }

        return new ElseStatement(statements);
    }

    @Override
    public Base visitWhile_rule(GrammaParser.While_ruleContext ctx) {
        List<Base> statements = new ArrayList<>();

        checkForLegalVar(ctx.expression().getChild(0).getText());
        checkForLegalVar(ctx.expression().getChild(2).getText());

        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                statements.add(visitStatement_rules(ctx.statement(i).statement_rules(j)));
            }

        }

        return new WhileStatement(new Condition(ctx.expression().getChild(0).getText(),
                ctx.expression().getChild(1).getText(), ctx.expression().getChild(2).getText()), statements);
    }

    @Override
    public Base visitFor_rule(GrammaParser.For_ruleContext ctx) {
        List<Base> statements = new ArrayList<>();
        DefineVar variable = (DefineVar) visit(ctx.expression(0));
        varTable.get("main").put(variable.getNameAndValue().getName(), variable.getType());
        Condition condition = visitCompare((GrammaParser.CompareContext) ctx.expression(1));
        Expression expression = (Expression) visit(ctx.expression(2));

        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                statements.add(visitStatement_rules(ctx.statement(i).statement_rules(j)));
            }

        }

        varTable.get("main").remove(variable.getNameAndValue().getName());
        return new ForStatement(variable, statements, condition, expression);
    }


    @Override
    public Base visitProgram(GrammaParser.ProgramContext ctx) {

        Base defaultRespond = null;
        if (ctx.function() != null) {
            for (int i = 0; i < ctx.function().size(); i++) {
                defaultRespond = visit(ctx.function(i));
            }
        }

        if (ctx.mainFunction() != null) {
            defaultRespond = visit(ctx.mainFunction());
        }

        return defaultRespond;
    }

    @Override
    public Base visitStatement(GrammaParser.StatementContext ctx) {
        Base defaultRes = null;
        for (int i = 0; i < ctx.statement_rules().size(); i++) {
            defaultRes = visit(ctx.statement_rules(i));
        }

        return defaultRes;
    }

    @Override
    public Base visitName(GrammaParser.NameContext ctx) {
        checkForLegalVar(ctx.NAME().getText());
        return new Expression(ctx.NAME().getText());
    }

    @Override
    public Base visitLeft(GrammaParser.LeftContext ctx) {
        checkForLegalVar(ctx.NAME().getText());
        return new UnaryOperator(ctx.NAME().getText(), ctx.UNARY_OPERATOR().getText(), "l");
    }

    @Override
    public Base visitRigth(GrammaParser.RigthContext ctx) {
        checkForLegalVar(ctx.NAME().getText());
        return new UnaryOperator(ctx.NAME().getText(), ctx.UNARY_OPERATOR().getText(), "r");
    }

    @Override
    public Base visitMainFunction(GrammaParser.MainFunctionContext ctx) {
        List<Base> statements = new ArrayList<>();

        Map<String, String> funcVars = new HashMap<>();
        varsMemory.clear();
        varTable.put("main", funcVars);

        for (int i = 0; i < ctx.statement().size(); i++) {

            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {
                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }

                varTable.get("main").putAll(varsMemory);
                Base statement = visit(ctx.statement(i).statement_rules(j));

                if (statement != null) {
                    statements.add(statement);
                }
            }
        }

        varsMemory.clear();

        MainFunction mainFunction = new MainFunction(statements);
        code.add(mainFunction.toString());
        return mainFunction;
    }

    @Override
    public Base visitBreak_rule(GrammaParser.Break_ruleContext ctx) {
        return new BrakeStatement();
    }

    @Override
    public Base visitFunction(GrammaParser.FunctionContext ctx) {
        List<Base> statements = new ArrayList<>();
        List<Parameter> parameters = new ArrayList<>();
        varsMemory.clear();
        for (int i = 0; i < ctx.parametr().size(); i++) {
            parameters.add(visitParametr(ctx.parametr(i)));
        }

        functionParamsMemory.put(ctx.NAME().getText(), parameters);

        Map<String, String> funcVars = new HashMap<>(varsMemory);
        varTable.put(ctx.NAME().getText(), funcVars);
        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {
                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }
                varTable.get(ctx.NAME().getText()).putAll(varsMemory);
                Base statement = visit(ctx.statement(i).statement_rules(j));
                if (statement != null) {
                    statements.add(statement);
                }
            }
        }
        varTable.get(ctx.NAME().getText()).putAll(varsMemory);


        statements.add(visit(ctx.return_rule()));

        Function function = new Function(parameters, ctx.NAME().getText(), ctx.TYPE().getText(), statements);
        code.add(function.toString());
        return function;

    }

    @Override
    public Parameter visitParametr(GrammaParser.ParametrContext ctx) {
        if (ctx.TYPE() != null) {
            varsMemory.put(ctx.NAME().getText(), ctx.TYPE().getText());
            return new Parameter(ctx.TYPE().getText(), ctx.NAME().getText());
        } else if (ctx.NAME() != null)
            return new Parameter(ctx.NAME().getText());
        else
            return new Parameter(ctx.NUM().getText());
    }

    @Override
    public Base visitReturn_rule(GrammaParser.Return_ruleContext ctx) {
        if (ctx.expression() != null)
            return new ReturnStatement((Expression) visit(ctx.expression()));
        else return new ReturnStatement((Expression) visit(ctx.function_call()));
    }

    @Override
    public Base visitFunction_call(GrammaParser.Function_callContext ctx) {
        if (!functionParamsMemory.containsKey(ctx.NAME().getText())) {
            try {
                throw new Exception("illegal function call");
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        } else if (functionParamsMemory.get(ctx.NAME().getText()).size() != ctx.parametr().size()) {
            try {
                throw new Exception("illegal function params");
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        }
        for (int i = 0; i < ctx.parametr().size(); i++) {
            checkForLegalVar(ctx.parametr(i).getText());
        }

        List<Base> parameters = new ArrayList<>();
        for (int i = 0; i < ctx.parametr().size(); i++) {
            parameters.add(visit(ctx.parametr(i)));
        }
        return new FunctionCall(parameters, ctx.NAME().getText(), "Test");
    }

    @Override
    public Base visitTypeConverter(GrammaParser.TypeConverterContext ctx) {
        TypeConversion typeConvertion;
        if (ctx.NUM() != null)
            typeConvertion = new TypeConversion(ctx.TYPE().getText(), ctx.NUM().getText());
        else if (ctx.NAME() != null) {
            if (varsMemory.containsKey(ctx.NAME().getText()))
                typeConvertion = new TypeConversion(ctx.TYPE().getText(), ctx.NAME().getText());
            else throw new ClassCastException("illegal var used");
        } else
            typeConvertion = new TypeConversion(ctx.TYPE().getText(), visit(ctx.dbl()).toString());


        return typeConvertion;
    }

    @Override
    public ContinueStatement visitContinue_rule(GrammaParser.Continue_ruleContext ctx) {
        return new ContinueStatement();
    }

    @Override
    public Base visitPrint_rule(GrammaParser.Print_ruleContext ctx) {
        PrintStatement printStatement = new PrintStatement(ctx.NAME().getText());
        return printStatement;
    }

    private void checkForLegalVar(String var) {
        count++;
        if (!varTable.lastEntry().getValue().containsKey(var)) {
            try {
                throw new Exception("illegal variable used: "  + var);
            } catch (Exception e) {
                e.printStackTrace();
                Walker.setErrors(true);
            }
        }

    }
}
