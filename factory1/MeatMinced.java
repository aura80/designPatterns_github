package designPatterns_github.designPatterns_github.factory1;

public class MeatMinced implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Meat("pork beef mixture", "Agroland S.A. Bucuresti", 500, true, "fresh");
    }
}
