package gen;
// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammaParser#dbl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbl(GrammaParser.DblContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametr(GrammaParser.ParametrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GrammaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(GrammaParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rigth}
	 * labeled alternative in {@link GrammaParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRigth(GrammaParser.RigthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GrammaParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(GrammaParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(GrammaParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(GrammaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(GrammaParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConverter}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConverter(GrammaParser.TypeConverterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idk}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdk(GrammaParser.IdkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(GrammaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEqlsFunc}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEqlsFunc(GrammaParser.VarEqlsFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammaParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVar(GrammaParser.DefineVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(GrammaParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(GrammaParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammaParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#return_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rule(GrammaParser.Return_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(GrammaParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#else_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_rule(GrammaParser.Else_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(GrammaParser.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#for_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rule(GrammaParser.For_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#break_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_rule(GrammaParser.Break_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#continue_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_rule(GrammaParser.Continue_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#print_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_rule(GrammaParser.Print_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#statement_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_rules(GrammaParser.Statement_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammaParser.ProgramContext ctx);
}