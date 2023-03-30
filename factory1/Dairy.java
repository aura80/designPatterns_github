package designPatterns_github.designPatterns_github.factory1;

public class Dairy implements SuperMarket{
    private String name;
    private String manufacturer;
    private int pieces;
    private boolean isShelfLife;
    private boolean isLiquid;
    private boolean isLowFat;

    public Dairy(String name, String manufacturer, int pieces, boolean isShelfLife, boolean isLiquid, boolean isLowFat) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pieces = pieces;
        this.isShelfLife = isShelfLife;
        this.isLiquid = isLiquid;
        this.isLowFat = isLowFat;
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

    public boolean isLiquid() {
        return isLiquid;
    }

    public boolean isLowFat() {
        return this.isLowFat;
    }

    @Override
    public String healthCare() {
        String s = "";
        if (isInShelfLife() && isLowFat()) {
            s = "This dairy is good for health!";
        } else {
            s = "Dairy expired or too fat!";
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dairy{").append("name='").append(name).append('\'').append(", manufacturer='")
                .append(manufacturer).append('\'').append(", pieces=").append(pieces).append(", isShelfLife=")
                .append(isShelfLife).append(", isLiquid=").append(isLiquid).append(", isLowFat=")
                .append(isLowFat).append('}');
        return stringBuilder.toString();
    }
}
