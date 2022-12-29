// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(gParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(gParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(gParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(gParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(gParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(gParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(gParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLp(gParser.LpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp(gParser.RpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(gParser.NumContext ctx);
}