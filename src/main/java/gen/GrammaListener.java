package gen;
// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaParser}.
 */
public interface GrammaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammaParser#dbl}.
	 * @param ctx the parse tree
	 */
	void enterDbl(GrammaParser.DblContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#dbl}.
	 * @param ctx the parse tree
	 */
	void exitDbl(GrammaParser.DblContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterParametr(GrammaParser.ParametrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitParametr(GrammaParser.ParametrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GrammaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GrammaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterLeft(GrammaParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitLeft(GrammaParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rigth}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterRigth(GrammaParser.RigthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rigth}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitRigth(GrammaParser.RigthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(GrammaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(GrammaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(GrammaParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(GrammaParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(GrammaParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(GrammaParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(GrammaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(GrammaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(GrammaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(GrammaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConverter}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConverter(GrammaParser.TypeConverterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConverter}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConverter(GrammaParser.TypeConverterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idk}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdk(GrammaParser.IdkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idk}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdk(GrammaParser.IdkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(GrammaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(GrammaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varEqlsFunc}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarEqlsFunc(GrammaParser.VarEqlsFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varEqlsFunc}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarEqlsFunc(GrammaParser.VarEqlsFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammaParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefineVar(GrammaParser.DefineVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefineVar(GrammaParser.DefineVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic(GrammaParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic(GrammaParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(GrammaParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(GrammaParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rule(GrammaParser.Return_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rule(GrammaParser.Return_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(GrammaParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(GrammaParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#else_rule}.
	 * @param ctx the parse tree
	 */
	void enterElse_rule(GrammaParser.Else_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#else_rule}.
	 * @param ctx the parse tree
	 */
	void exitElse_rule(GrammaParser.Else_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_rule(GrammaParser.While_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_rule(GrammaParser.While_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_rule(GrammaParser.For_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_rule(GrammaParser.For_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#break_rule}.
	 * @param ctx the parse tree
	 */
	void enterBreak_rule(GrammaParser.Break_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#break_rule}.
	 * @param ctx the parse tree
	 */
	void exitBreak_rule(GrammaParser.Break_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#continue_rule}.
	 * @param ctx the parse tree
	 */
	void enterContinue_rule(GrammaParser.Continue_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#continue_rule}.
	 * @param ctx the parse tree
	 */
	void exitContinue_rule(GrammaParser.Continue_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#print_rule}.
	 * @param ctx the parse tree
	 */
	void enterPrint_rule(GrammaParser.Print_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#print_rule}.
	 * @param ctx the parse tree
	 */
	void exitPrint_rule(GrammaParser.Print_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#statement_rules}.
	 * @param ctx the parse tree
	 */
	void enterStatement_rules(GrammaParser.Statement_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#statement_rules}.
	 * @param ctx the parse tree
	 */
	void exitStatement_rules(GrammaParser.Statement_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammaParser.ProgramContext ctx);
}