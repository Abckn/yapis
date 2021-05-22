// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaParser}.
 */
public interface GrammaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusminus(GrammaParser.PlusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusminus(GrammaParser.PlusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(GrammaParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(GrammaParser.MultdivContext ctx);
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
	 * Enter a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammaParser.StatementContext ctx);
}