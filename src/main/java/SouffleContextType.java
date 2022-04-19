public enum SouffleContextType {
    DOCUMENT, //Whole document context
    RELATION_DECL, //Relation context (Including args)
    RELATION_USE, //Relation use context (Facts, in rule) (Without args)
    RULE, //Rule context
    COMPONENT, //Component context
    VARIABLE, //Variable context
    TYPE //Type context
}
