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
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminus(GrammaParser.PlusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(GrammaParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammaParser.StatementContext ctx);
}