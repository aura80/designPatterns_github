package designPatterns_github.designPatterns_github.builder_with_separate_class;

public enum FruitsMint {
    STRAWBERRIES("Strawberries"),
    BLUEBERRIES("Blueberries"),
    ANANAS("Ananas"),
    MELON("Melon"),
    MINT("Mint");

    public final String message;

    FruitsMint(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
