// Generated from /home/john/IdeaProjects/Souffle Ide Plugin/grammar/Souffle.g4 by ANTLR 4.9.2
package visitors;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SouffleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SouffleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SouffleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SouffleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(SouffleParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(SouffleParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(SouffleParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#record_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_list(SouffleParser.Record_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#union_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_type_list(SouffleParser.Union_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#adt_branch_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdt_branch_list(SouffleParser.Adt_branch_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#adt_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdt_branch(SouffleParser.Adt_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#relation_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_decl(SouffleParser.Relation_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#relation_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_names(SouffleParser.Relation_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#attributes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes_list(SouffleParser.Attributes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_attributes(SouffleParser.Non_empty_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SouffleParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#relation_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_tags(SouffleParser.Relation_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_attribute_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_attribute_names(SouffleParser.Non_empty_attribute_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#dependency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency(SouffleParser.DependencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#dependency_list_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency_list_aux(SouffleParser.Dependency_list_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#dependency_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency_list(SouffleParser.Dependency_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(SouffleParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#souffle_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSouffle_rule(SouffleParser.Souffle_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#rule_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_def(SouffleParser.Rule_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(SouffleParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SouffleParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(SouffleParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(SouffleParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SouffleParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SouffleParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(SouffleParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(SouffleParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_arg_list(SouffleParser.Non_empty_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SouffleParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#functor_built_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctor_built_in(SouffleParser.Functor_built_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#aggregate_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_func(SouffleParser.Aggregate_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#aggregate_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_body(SouffleParser.Aggregate_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#query_plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_plan(SouffleParser.Query_planContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#query_plan_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_plan_list(SouffleParser.Query_plan_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#plan_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan_order(SouffleParser.Plan_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_plan_order_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_plan_order_list(SouffleParser.Non_empty_plan_order_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_decl(SouffleParser.Component_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_head(SouffleParser.Component_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_type(SouffleParser.Component_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_type_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_type_params(SouffleParser.Component_type_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_param_list(SouffleParser.Component_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_body(SouffleParser.Component_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#component_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_init(SouffleParser.Component_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#functor_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctor_decl(SouffleParser.Functor_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#functor_arg_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctor_arg_type_list(SouffleParser.Functor_arg_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_functor_arg_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_functor_arg_type_list(SouffleParser.Non_empty_functor_arg_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#functor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctor_attribute(SouffleParser.Functor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(SouffleParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#directive_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_head(SouffleParser.Directive_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#directive_head_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_head_decl(SouffleParser.Directive_head_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#directive_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_list(SouffleParser.Directive_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#relation_directive_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_directive_list(SouffleParser.Relation_directive_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#non_empty_key_value_pairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_key_value_pairs(SouffleParser.Non_empty_key_value_pairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SouffleParser#kvp_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKvp_value(SouffleParser.Kvp_valueContext ctx);
}