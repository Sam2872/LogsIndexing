// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(gParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(gParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(gParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(gParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(gParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(gParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(gParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(gParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(gParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(gParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(gParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(gParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(gParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(gParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lp}.
	 * @param ctx the parse tree
	 */
	void enterLp(gParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lp}.
	 * @param ctx the parse tree
	 */
	void exitLp(gParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(gParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(gParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(gParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(gParser.NumContext ctx);
}