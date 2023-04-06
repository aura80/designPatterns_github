package designPatterns_github.designPatterns_github.builder_with_separate_class.otherPackageClass;

import designPatterns_github.designPatterns_github.builder_with_separate_class.MintLemonade;

public class MintLemonadeBuilder {
    private Integer lemons;
    private Double water;
    private Double sugar;
    private Double price;
    private Boolean isMint;

    public MintLemonadeBuilder withLemons(Integer lemons) {
        this.lemons = lemons;
        return this;
    }

    public MintLemonadeBuilder withWater(Double water) {
        this.water = water;
        return this;
    }

    public MintLemonadeBuilder withSugar(Double sugar) {
        this.sugar = sugar;
        return this;
    }

    public MintLemonadeBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public MintLemonadeBuilder withIsMint(Boolean isMint) {
        this.isMint = isMint;
        return this;
    }

    public MintLemonade buildLemonade() {
        return new MintLemonade(lemons, water, sugar,price);
    }
}
