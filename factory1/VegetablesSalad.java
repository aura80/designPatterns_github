package designPatterns_github.designPatterns_github.factory1;

public class VegetablesSalad implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Vegetables("Iceberg salad", "hahaha China", 250, false, "green");
    }
}
