// Generated from /home/john/IdeaProjects/Souffle_Ide_Plugin/grammar/Preprocessor.g4 by ANTLR 4.10.1
package preprocessor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PreprocessorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PreprocessorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#program_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_text(PreprocessorParser.Program_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#non_empty_directive_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_directive_list(PreprocessorParser.Non_empty_directive_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#pragma_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_directive(PreprocessorParser.Pragma_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#ifdef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_directive(PreprocessorParser.Ifdef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#else_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive(PreprocessorParser.Else_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#include_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_directive(PreprocessorParser.Include_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#define_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_directive(PreprocessorParser.Define_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#macro_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_def(PreprocessorParser.Macro_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#macro_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_body(PreprocessorParser.Macro_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreprocessorParser#macro_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_args(PreprocessorParser.Macro_argsContext ctx);
}