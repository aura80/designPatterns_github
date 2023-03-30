package designPatterns_github.designPatterns_github.factory1;

public class DairyMilk implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Dairy("Cow Milk 1,5%","Zuzu Dairy S.A.", 80, true, true, true);
    }
}
