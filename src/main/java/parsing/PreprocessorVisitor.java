package parsing;

import parsing.preprocessor.PreprocessorBaseVisitor;
import parsing.preprocessor.PreprocessorParser;

import java.util.HashSet;
import java.util.Set;

public class PreprocessorVisitor extends PreprocessorBaseVisitor<Void> {
    Set<String> defines;

    public PreprocessorVisitor() {
        defines = new HashSet<>();
    }

    public PreprocessorVisitor(Set<String> defines) {
        this.defines = defines;
    }

    @Override
    public Void visitMacro_def(PreprocessorParser.Macro_defContext ctx) {
        defines.add(ctx.IDENT(0).getText());
        return null;
    }
}
