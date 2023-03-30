package designPatterns_github.designPatterns_github.factory1;

public class DrinksWine implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Drinks("The Power of The Bear Red Wine", "S.C. Starmina Wines S.A.", 235, false, false);
    }
}
