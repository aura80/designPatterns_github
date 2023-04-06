package designPatterns_github.designPatterns_github.builder_with_separate_class;

import java.util.List;
import java.util.Map;

public class Lemonade {
    private Integer noLemons;
    private Float grSugar;
    private Float lWater;
    private List<Map.Entry<String, Boolean>> otherFruits;
    private Float price;

    Lemonade(Integer noLemons, Float grSugar, Float lWater, List<Map.Entry<String, Boolean>> otherFruits, Float price) {
        this.noLemons = noLemons;
        this.grSugar = grSugar;
        this.lWater = lWater;
        this.otherFruits = otherFruits;
        this.price = price;
    }

    public Integer getNoLemons() {
        return noLemons;
    }

    public void setNoLemons(Integer noLemons) {
        this.noLemons = noLemons;
    }

    public Float getGrSugar() {
        return grSugar;
    }

    public void setGrSugar(Float grSugar) {
        this.grSugar = grSugar;
    }

    public Float getlWater() {
        return lWater;
    }

    public void setlWater(Float lWater) {
        this.lWater = lWater;
    }

    public List<Map.Entry<String, Boolean>> getOtherFruits() {
        return otherFruits;
    }

    public void setOtherFruits(List<Map.Entry<String, Boolean>> otherFruits) {
        this.otherFruits = otherFruits;
    }

    public Float getPrice() {
        return lWater;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lemonade Ingredients{" +
                "noLemons=" + noLemons +
                ", grSugar=" + grSugar +
                ", lWater=" + lWater +
                ", otherFruits=" + otherFruits +
                ", price=" + price +
                '}';
    }
}
