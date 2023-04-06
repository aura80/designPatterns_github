package designPatterns_github.designPatterns_github.builder_with_internal_default_constructor_static_class;

import java.util.*;

public class HouseBuild {
    public static void main(String[] args) {
        final House tinyHouse = new House.HouseBuilder().withBricksNo(2400).withTilesNo(1200).withCementKg(250.3)
                .withPaintKg(182.27).withPaintColor("cream").withDoorsNo(15).withWindowsNo(10)
                .withWorkers(List.of("Gigel", "Costel", "Fanel", "Vasile", "Ionel", "Dorel"))
                .withSalary(900.0).withWorksOnWeekend(Arrays.asList(false, false, true, false, true, true))
                .withBonus(85.2).build();
        System.out.println(tinyHouse);

        System.out.println(tinyHouse.getWorkers());
        System.out.println(tinyHouse.getWorksOnWeekend());

        workingOnWeekend(tinyHouse);

        System.out.println();

        final House bigHouse = new House.HouseBuilder().withSalary(30000.3).build();
        bigHouse.setBricksNo(5000);
        bigHouse.setTilesNo(7500);
        bigHouse.setCementKg(1429.84);
        bigHouse.setPaintKg(500.7);
        bigHouse.setPaintColor("peach");
        bigHouse.setDoorsNo(30);
        bigHouse.setWindowsNo(48);
        bigHouse.setWorkers(Arrays.asList(Workers.BUILDERS.getMessage(), Workers.DECORATORS.getMessage(), Workers.INSTALLERS.getMessage()));
        bigHouse.setWorksOnWeekend(List.of(false, true, true));
        bigHouse.setBonus(500.0);

        System.out.println(bigHouse);
        System.out.println();
        System.out.println("Workers: " + bigHouse.getWorkers());
        System.out.println();
        System.out.println("Bricks no.: " + bigHouse.getBricksNo() + "      Tiles no.: " + bigHouse.getTilesNo()
                + "         Cement kg:  " + bigHouse.getCementKg());
        System.out.println("Paint l: " + bigHouse.getPaintKg()
                + "        Paint color: " + bigHouse.getPaintColor() + "      Doors no.: " + bigHouse.getDoorsNo());
        System.out.println("Windows no.: " + bigHouse.getWindowsNo() + "       Bonus: " + bigHouse.getBonus());
        System.out.println();

        workingOnWeekend(bigHouse);
    }

    private static void workingOnWeekend(House house) {
        Map<String, Boolean> workersMap = new LinkedHashMap<>();
        List<Map.Entry<String, Boolean>> workersMapList = new ArrayList<>();

        for (int i = 0; i < house.getWorkers().size(); i++) {
            for (int j = 0; j < house.getWorksOnWeekend().size(); j++) {
                if (i == j) {
                    workersMap.put(house.getWorkers().get(i), house.getWorksOnWeekend().get(j));
                }
            }
        }

        System.out.println("Working weekends map  - " + workersMap);

        for (Map.Entry<String, Boolean> map : workersMap.entrySet()) {
            workersMapList.add(map);
        }

//        equivalent to:
//        workersMapList.addAll(workersMap.entrySet()); 

        System.out.println("Working weekends list - " + workersMapList);

        afterBonuses(house, workersMapList);

    }

    private static void afterBonuses(House house, List<Map.Entry<String, Boolean>> workersMapList) {
        Map<String, Double> salaryAfterBonuses = new LinkedHashMap<>();
        List<Map.Entry<String, Double>> salaryAfterBonusesList = new ArrayList<>();

        for (Map.Entry<String, Boolean> m : workersMapList) {
            Double d = house.getSalary();
            if (m.getValue()) {
                d += house.getBonus();

            }
            if (Workers.BUILDERS.getMessage().equalsIgnoreCase(m.getKey())) {
                d += 61000.0;
            }

            if (Workers.INSTALLERS.getMessage().equalsIgnoreCase(m.getKey())) {
                d += 32000.0;
            }
            salaryAfterBonuses.put(m.getKey(), d);
        }

        System.out.println("After bonuses map     - " + salaryAfterBonuses);

        salaryAfterBonusesList.addAll(salaryAfterBonuses.entrySet());

        System.out.println("After bonuses list    - " + salaryAfterBonusesList);
    }
}
