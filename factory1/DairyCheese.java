package designPatterns_github.designPatterns_github.factory1;

public class DairyCheese implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Dairy("Cheese with sour cream", "KF Group S.A.", 175, true, false, false);
    }
}
