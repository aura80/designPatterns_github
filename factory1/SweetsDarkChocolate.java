package designPatterns_github.designPatterns_github.factory1;

public class SweetsDarkChocolate implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Sweets("Poiana Dark Chocolate", "S.C. Poiana S.A.", 350, true);
    }
}
