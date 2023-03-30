package designPatterns_github.designPatterns_github.factory1;

public class Drinks implements SuperMarket{
    private String name;
    private String manufacturer;
    private int pieces;
    private boolean isShelfLife;
    private boolean isAlcoholFree;

    public Drinks(String name, String manufacturer, int pieces, boolean isShelfLife, boolean isAlcoholFree) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pieces = pieces;
        this.isShelfLife = isShelfLife;
        this.isAlcoholFree = isAlcoholFree;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public int getPieces() {
        return this.pieces;
    }

    @Override
    public boolean isInShelfLife() {
        return this.isShelfLife;
    }

    @Override
    public String healthCare() {
        if (isInShelfLife()) return "Good for health!";
        else return "Not good for health!";
    }

    public boolean isAlcoholFree() {
        return this.isAlcoholFree;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Drinks{").append("name='").append(name).append('\'').append(", manufacturer='")
                .append(manufacturer).append('\'').append(", pieces=").append(pieces).append(", isShelfLife=")
                .append(isShelfLife).append(", isAlcoholFree=").append(isAlcoholFree).append('\'').append('}');
        return stringBuilder.toString();
    }
}
