package designPatterns_github.designPatterns_github.factory1;

public class MeatProcessed implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Meat("Sibiu salami", "Agricola S.A.", 400, true, "processed");
    }
}
