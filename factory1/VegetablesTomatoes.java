package designPatterns_github.designPatterns_github.factory1;

public class VegetablesTomatoes implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Vegetables("Cherry tomatoes", "S.C. Horticultura S.A.", 30, true, "red");
    }
}
