package designPatterns_github.designPatterns_github.factory1;

public class DrinksJuice implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Drinks("Lemon Juice", "Super Drinks Holding S.A.", 1280, true, true);
    }
}
