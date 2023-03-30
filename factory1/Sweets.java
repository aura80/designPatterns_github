package designPatterns_github.designPatterns_github.factory1;

public class Sweets implements SuperMarket{
    private String name;
    private String manufacturer;
    private int pieces;
    private boolean isShelfLife;

    public Sweets(String name, String manufacturer, int pieces, boolean isShelfLife) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pieces = pieces;
        this.isShelfLife = isShelfLife;
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
        return "Sweets expired!";
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", pieces=" + pieces +
                ", isShelfLife=" + isShelfLife +
                '}';
    }
}
