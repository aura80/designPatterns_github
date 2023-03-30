package designPatterns_github.designPatterns_github.factory1;

public class DrinksWater implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Drinks("Carpati water", "Imbutelierea S.A.", 2500, true, true);
    }
}
