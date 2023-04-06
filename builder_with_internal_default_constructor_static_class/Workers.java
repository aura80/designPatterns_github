package designPatterns_github.designPatterns_github.builder_with_internal_default_constructor_static_class;

public enum Workers {
    BUILDERS("S.C. Builders S.A."),
    INSTALLERS("Installers S.A."),
    DECORATORS("Decorators S.A.")
    ;

    private final String message;

    Workers(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
