package designPatterns_github.designPatterns_github.factory1;

public class SweetsCake implements SuperMarketFactory{
    @Override
    public SuperMarket makeInventory() {
        return new Sweets("Cheese Cake with fruits", "Deluxe Sweets S.A.", 180, true);
    }
}
