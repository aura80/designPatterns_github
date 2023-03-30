package designPatterns_github.designPatterns_github.factory1;

public class Vegetables implements SuperMarket{
    private String name;
    private String manufacturer;
    private int pieces;
    private boolean isShelfLife;
    private String color;

    public Vegetables(String name, String manufacturer, int pieces, boolean isShelfLife, String color) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pieces = pieces;
        this.isShelfLife = isShelfLife;
        this.color = color;
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
        return "Vegetables expired!";
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", pieces=" + pieces +
                ", isShelfLife=" + isShelfLife +
                ", color='" + color + '\'' +
                '}';
    }
}
