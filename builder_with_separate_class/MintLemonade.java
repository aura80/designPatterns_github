package designPatterns_github.designPatterns_github.builder_with_separate_class;

public class MintLemonade {
    private Integer lemons;
    private Double water;
    private Double sugar;
    private Double price;
    private Boolean isMint;

    public MintLemonade(Integer lemons, Double water, Double sugar, Double price) {
        this.lemons = lemons;
        this.water = water;
        this.sugar = sugar;
        this.price = price;
    }

    public Integer getLemons() {
        return lemons;
    }

    public void setLemons(Integer lemons) {
        this.lemons = lemons;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getMint() {
        return isMint;
    }

    public void setMint(Boolean mint) {
        isMint = mint;
    }

    @Override
    public String toString() {
        return "MintLemonade{" +
                "lemons=" + lemons +
                ", water=" + water +
                ", sugar=" + sugar +
                ", price=" + price +
                '}';
    }
}
