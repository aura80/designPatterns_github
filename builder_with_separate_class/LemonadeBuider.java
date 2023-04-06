package designPatterns_github.designPatterns_github.builder_with_separate_class;

import java.util.List;
import java.util.Map;

public class LemonadeBuider {
    private Integer noLemons;
    private Float grSugar;
    private Float lWater;
    private List<Map.Entry<String, Boolean>> otherFruits;
    private Float price;

    public LemonadeBuider withNoLemons(Integer noLemons) {
        this.noLemons = noLemons;
        return this;
    }

    public LemonadeBuider withGrSugar(Float grSugar) {
        this.grSugar = grSugar;
        return this;
    }

    public LemonadeBuider withLWater(Float lWater) {
        this.lWater = lWater;
        return this;
    }

    public LemonadeBuider withOtherFruits(List<Map.Entry<String, Boolean>> otherFruits) {
        this.otherFruits = otherFruits;
        return this;
    }

    public LemonadeBuider withPrice(Float price) {
        this.price = price;
        return this;
    }

    public Lemonade build() {
        return new Lemonade(noLemons, grSugar, lWater, otherFruits, price);
    }
}
