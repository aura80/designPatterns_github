package designPatterns_github.designPatterns_github.factory1;

public class Meat implements SuperMarket{
    private String name;
    private String manufacturer;
    private int pieces;
    private boolean isShelfLife;
    private String type;

    public Meat(String name, String manufacturer, int pieces, boolean isShelfLife, String type) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pieces = pieces;
        this.isShelfLife = isShelfLife;
        this.type = type;
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
        if (isInShelfLife() && !getType().equalsIgnoreCase("processed")) return "Good for health!";
        else return "Meet not good for health!";
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Meat{").append("name='").append(name).append('\'').append(", manufacturer='")
                .append(manufacturer).append('\'').append(", pieces=").append(pieces).append(", isShelfLife=")
                .append(isShelfLife).append(", type=").append(type).append('\'').append('}');
        return stringBuilder.toString();
    }
}
