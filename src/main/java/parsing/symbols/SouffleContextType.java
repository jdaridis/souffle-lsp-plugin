package parsing.symbols;

public enum SouffleContextType {
    DOCUMENT, //Whole document context
    RELATION_DECL, //Relation context (Including args)
    RELATION_USE, //Relation use context (Facts, in rule) (Without args)
    RULE, //Rule context
    COMPONENT, //Component context
    ATTRIBUTE, //Variable context
    TYPE, //Type context

    DIRECTIVE
}
