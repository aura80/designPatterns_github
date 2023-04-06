package designPatterns_github.designPatterns_github.builder_with_separate_class;

import designPatterns_github.designPatterns_github.builder_with_separate_class.otherPackageClass.MintLemonadeBuilder;

import java.util.*;

public class MakeLemonade {
    public static void main(String[] args) {
        Map<String, Boolean> mapFruits = new LinkedHashMap<>();
        mapFruits.put(FruitsMint.STRAWBERRIES.getMessage(), true);
        mapFruits.put(FruitsMint.BLUEBERRIES.getMessage(), false);
        mapFruits.put(FruitsMint.ANANAS.getMessage(), false);
        mapFruits.put(FruitsMint.MELON.getMessage(), true);
        mapFruits.put(FruitsMint.MINT.getMessage(), true);
        System.out.println("The map of fruits: " + mapFruits);

        List<Map.Entry<String, Boolean>> fruits = new ArrayList<>();
        fruits.addAll(mapFruits.entrySet());
        final Lemonade lemonade1 = new LemonadeBuider().withNoLemons(5).withLWater(3.5f)
                .withGrSugar(75.3f).withPrice(48.32f).withOtherFruits(fruits).build();

        System.out.println(lemonade1);
        lemonade1.setlWater(10f);
        lemonade1.setGrSugar(300f);
        lemonade1.setNoLemons(8);
        lemonade1.setPrice(38.7f);
        System.out.println(lemonade1);

        final MintLemonade lemonadeMint = new MintLemonadeBuilder().withIsMint(true).withLemons(15).withWater(9.3)
                        .withSugar(550.45).withPrice(150.87).buildLemonade();
        System.out.println(lemonadeMint);
        System.out.println();

        System.out.println("Unsorted list of fruits: " + mapFruits.entrySet());

        Collections.sort(fruits, new Comparator<Map.Entry<String, Boolean>>() {
            @Override
            public int compare(Map.Entry<String, Boolean> o1, Map.Entry<String, Boolean> o2) {
                return o1.getKey().charAt(0) - o2.getKey().charAt(0);
            }
        });

        System.out.println("Sorted list of fruits: " + fruits);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose fruits or mint: ");

        while (scanner.hasNext()) {
            String chooseFruit = scanner.next();
            switch (chooseFruit) {
                case "Strawberries":
                case "strawberries":
                    if (mapFruits.get(FruitsMint.STRAWBERRIES.getMessage())) {
                        System.out.println("Order in preparation");
                    } else {
                        System.out.println("Strawberries are missing");
                    }
                    break;
                case "Blueberries":
                case "blueberries":
                    if (mapFruits.get(FruitsMint.BLUEBERRIES.getMessage())) {
                        System.out.println("Order in preparation");
                    } else {
                        System.out.println("Blueberries are missing");
                    }
                    break;
                case "Ananas":
                case "ananas":
                    if (mapFruits.get(FruitsMint.ANANAS.getMessage())) {
                        System.out.println("Order in preparation");
                    } else {
                        System.out.println("Ananas is missing");
                    }
                    break;
                case "Melon":
                case "melon":
                    if (mapFruits.get(FruitsMint.MELON.getMessage())) {
                        System.out.println("Order in preparation");
                    } else {
                        System.out.println("Melon is missing");
                    }
                    break;
                case "Mint":
                case "mint":
                    if (mapFruits.get(FruitsMint.MELON.getMessage())) {
                        System.out.println("Order in preparation");
                    } else {
                        System.out.println("Mint is missing");
                    }
                    break;
                default:
                    if ("x".equalsIgnoreCase(chooseFruit)) {
                    } else
                        System.out.println("Try again!");
            }
            if ("x".equalsIgnoreCase(chooseFruit)) {
                break;
            }
        }

    }
}
