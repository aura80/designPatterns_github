package designPatterns_github.designPatterns_github.factory1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeInventory {
    public static void main(String[] args) {
        List<String> productNameList = Arrays.asList("Cheese with sour cream", "Cow Milk 1,5%", "Lemon Juice", 
                "Carpati water", "The Power of The Bear Red Wine", "Pork beef mixture",
                "Sibiu salami", "Cheese Cake with fruits", "Poiana Dark Chocolate", "Iceberg salad", "Cherry tomatoes");

        getListOfProducts(productNameList);

        System.out.println();

        SuperMarketFactory milkFactory = new DairyMilk();
        SuperMarket superMarketMilk = milkFactory.makeInventory();
        System.out.println(superMarketMilk);
        System.out.println(superMarketMilk.getName());
        System.out.println(superMarketMilk.getManufacturer());
        System.out.println(superMarketMilk.getPieces());
        System.out.println(superMarketMilk.healthCare());
        System.out.println();
        SuperMarketFactory cheeseFactory = new DairyCheese();
        SuperMarket superMarketCheese = cheeseFactory.makeInventory();
        System.out.println(superMarketCheese);
        System.out.println(superMarketCheese.getName());
        System.out.println(superMarketCheese.getManufacturer());
        System.out.println(superMarketCheese.getPieces());
        System.out.println(superMarketCheese.healthCare());
        System.out.println();
        SuperMarketFactory juiceFactory = new DrinksJuice();
        SuperMarket superMarketJuice = juiceFactory.makeInventory();
        System.out.println(superMarketJuice);
        System.out.println(superMarketJuice.getName());
        System.out.println(superMarketJuice.getManufacturer());
        System.out.println(superMarketJuice.getPieces());
        System.out.println(superMarketJuice.healthCare());
        System.out.println();
        SuperMarketFactory wineFactory = new DrinksWine();
        SuperMarket superMarketWine = wineFactory.makeInventory();
        System.out.println(superMarketWine);
        System.out.println(superMarketWine.getName());
        System.out.println(superMarketWine.getManufacturer());
        System.out.println(superMarketWine.getPieces());
        System.out.println(superMarketWine.healthCare());
        System.out.println();
        SuperMarketFactory mincedMeatFactory = new MeatMinced();
        SuperMarket superMarketMincedMeat = mincedMeatFactory.makeInventory();
        System.out.println(superMarketMincedMeat);
        System.out.println(superMarketMincedMeat.getName());
        System.out.println(superMarketMincedMeat.getManufacturer());
        System.out.println(superMarketMincedMeat.getPieces());
        System.out.println(superMarketMincedMeat.healthCare());
        System.out.println();
        SuperMarketFactory processedMeatFactory = new MeatProcessed();
        SuperMarket superMarketProcessedMeat = processedMeatFactory.makeInventory();
        System.out.println(superMarketProcessedMeat);
        System.out.println(superMarketProcessedMeat.getName());
        System.out.println(superMarketProcessedMeat.getManufacturer());
        System.out.println(superMarketProcessedMeat.getPieces());
        System.out.println(superMarketProcessedMeat.healthCare());
        System.out.println();
        SuperMarketFactory cakeFactory = new SweetsCake();
        SuperMarket superMarketCake = cakeFactory.makeInventory();
        System.out.println(superMarketCake);
        System.out.println(superMarketCake.getName());
        System.out.println(superMarketCake.getManufacturer());
        System.out.println(superMarketCake.getPieces());
        System.out.println(superMarketCake.healthCare());
        System.out.println();
        SuperMarketFactory tomatoesFactory = new VegetablesTomatoes();
        SuperMarket superMarketTomatoes = tomatoesFactory.makeInventory();
        System.out.println(superMarketTomatoes);
        System.out.println(superMarketTomatoes.getName());
        System.out.println(superMarketTomatoes.getManufacturer());
        System.out.println(superMarketTomatoes.getPieces());
        System.out.println(superMarketTomatoes.healthCare());
    }

    public static void getListOfProducts(List<String> productNameList) {

        SuperMarketFactory superMarketFactory;

        for (String product : productNameList) {
            if (product.equalsIgnoreCase("Cheese with sour cream")) {
                superMarketFactory = new DairyCheese();
            } else if (product.equalsIgnoreCase("Cow Milk 1,5%")) {
                superMarketFactory = new DairyMilk();
            } else if (product.equalsIgnoreCase("Lemon Juice")) {
                superMarketFactory = new DrinksJuice();
            } else if (product.equalsIgnoreCase("Carpati Water")) {
                superMarketFactory = new DrinksWater();
            } else if (product.equalsIgnoreCase("The Power of The Bear Red Wine")) {
                superMarketFactory = new DrinksWine();
            } else if (product.equalsIgnoreCase("pork beef mixture")) {
                superMarketFactory = new MeatMinced();
            } else if (product.equalsIgnoreCase("Sibiu salami")) {
                superMarketFactory = new MeatProcessed();
            } else if (product.equalsIgnoreCase("Cheese Cake with fruits")) {
                superMarketFactory = new SweetsCake();
            } else if (product.equalsIgnoreCase("Poiana Dark Chocolate")) {
                superMarketFactory = new SweetsDarkChocolate();
            } else if (product.equalsIgnoreCase("Iceberg salad")) {
                superMarketFactory = new VegetablesSalad();
            } else if (product.equalsIgnoreCase("Cherry tomatoes")) {
                superMarketFactory = new VegetablesTomatoes();
            } else {
                throw new RuntimeException("Unknown product");
            }

            SuperMarket superMarket = superMarketFactory.makeInventory();
            System.out.println(superMarket);
        }
    }
}
