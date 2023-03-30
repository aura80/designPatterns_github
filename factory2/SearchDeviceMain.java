package designPatterns_github.designPatterns_github.factory2;

import java.util.*;

public class SearchDeviceMain {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device phone = deviceFactory.getDevice(HardCodedMessages.iPhone, HardCodedMessages.iPhonePrice,
                HardCodedMessages.iPhoneColor, Manufacturer.IPHONE);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        System.out.println();
        Device tv = deviceFactory.getDevice(HardCodedMessages.ledSamsungTV, HardCodedMessages.ledSamsungTVPrice,
                HardCodedMessages.ledSamsungTVColor, Manufacturer.SAMSUNG);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println();
        Device coffeeMachine = deviceFactory.getDevice(HardCodedMessages.coffeeMachine,
                HardCodedMessages.coffeeMachinePrice, HardCodedMessages.coffeeMachineColor, Manufacturer.PHILIPS);
        System.out.println(coffeeMachine);
        System.out.println(coffeeMachine.hashCode());
        System.out.println();
        Device owen = deviceFactory.getDevice(HardCodedMessages.owenZanussi, HardCodedMessages.owenZanussiPrice,
                HardCodedMessages.owenZanussiColor, Manufacturer.ZANUSSI);
        System.out.println(owen);
        System.out.println(owen.hashCode());
        System.out.println();
        Device waterPurifier = deviceFactory.getDevice(HardCodedMessages.waterPurifier,
                HardCodedMessages.waterPurifierPrice, HardCodedMessages.waterPurifierColor, Manufacturer.ZEPTER);
        System.out.println(waterPurifier);
        System.out.println(waterPurifier.hashCode());
        System.out.println();
        System.out.println(phone.getDeviceName() + "                        " + phone.getDevicePrice() + "    "
                + phone.getDeviceColor() + "    " + phone.getDeviceManufacturer() + '\n' + tv.getDeviceName()
                + "             " + tv.getDevicePrice() + "   " + tv.getDeviceColor() + "   "
                + tv.getDeviceManufacturer() + '\n' + coffeeMachine.getDeviceName() + "      "
                + coffeeMachine.getDevicePrice() + "    " + coffeeMachine.getDeviceColor() + "    "
                + coffeeMachine.getDeviceManufacturer() + '\n' + owen.getDeviceName() + "   "
                + owen.getDevicePrice() + "    "+ owen.getDeviceColor() + "    " + owen.getDeviceManufacturer() + '\n'
                + waterPurifier.getDeviceName() + "      " + waterPurifier.getDevicePrice() + "    "
                + waterPurifier.getDeviceColor() + "    " + waterPurifier.getDeviceManufacturer());
        System.out.println();

        float x = phone.getDevicePrice() + tv.getDevicePrice() + coffeeMachine.getDevicePrice()
                + owen.getDevicePrice() + waterPurifier.getDevicePrice();
        System.out.println("Total cost: " + x);

        System.out.println();

        final Map<Float, Manufacturer> mapPriceManufacturer = new TreeMap<>();
        mapPriceManufacturer.put(HardCodedMessages.iPhonePrice, Manufacturer.IPHONE);
        mapPriceManufacturer.put(HardCodedMessages.ledSamsungTVPrice, Manufacturer.SAMSUNG);
        mapPriceManufacturer.put(HardCodedMessages.coffeeMachinePrice, Manufacturer.PHILIPS);
        mapPriceManufacturer.put(HardCodedMessages.owenZanussiPrice, Manufacturer.ZANUSSI);
        mapPriceManufacturer.put(HardCodedMessages.waterPurifierPrice, Manufacturer.ZEPTER);

        List<Map.Entry<Float, Manufacturer>> listOfMapEntries = new ArrayList<Map.Entry<Float, Manufacturer>>(mapPriceManufacturer.entrySet());

        Collections.sort(listOfMapEntries, new Comparator<Map.Entry<Float, Manufacturer>>(){

            @Override
            public int compare(Map.Entry<Float, Manufacturer> o1, Map.Entry<Float, Manufacturer> o2) {
                return o1.getKey().hashCode() - o2.getKey().hashCode();
            }
        });

        System.out.println("Map elements sorted ascending by key in a list:   " + listOfMapEntries);

        Collections.sort(listOfMapEntries, new Comparator<Map.Entry<Float, Manufacturer>>(){

            @Override
            public int compare(Map.Entry<Float, Manufacturer> o1, Map.Entry<Float, Manufacturer> o2) {
                return o1.getValue().ordinal() - o2.getValue().ordinal();
            }
        });

        System.out.println("Map elements sorted in ordinal order from the enum Manufacturer by value in a list:   " + listOfMapEntries);
        System.out.println();
        System.out.println("The order of elements as added in the enum Manufacturer: ");

        for (int i = 0; i < listOfMapEntries.size(); i++){
            System.out.println(listOfMapEntries.get(i).getValue().ordinal() + "   -   " + listOfMapEntries.get(i));
        }

        System.out.println("The order of elements sorted ascending by price: ");
        for (final Map.Entry<Float, Manufacturer> sortedOrderPriceKey : mapPriceManufacturer.entrySet() ){
            System.out.println(sortedOrderPriceKey.getValue().ordinal() + "   -   " + sortedOrderPriceKey.getKey() + " Euro   " + sortedOrderPriceKey.getValue());
        }

        System.out.println("The order of elements from the sorted list by price: ");

        int sum = 0;
        for (final Map.Entry<Float, Manufacturer> fm : mapPriceManufacturer.entrySet() ){
            sum += 1;
            System.out.println(sum - 1 + "   -   " + fm.getKey() + "   -   " + fm.getValue());
        }
        System.out.println("----------------------------");
        System.out.println("Total:  " + x + "  Euro");

        System.out.println();
        Device phone2 = deviceFactory.getDevice("Samsung Galaxy", 450.3f, "blue", Manufacturer.SAMSUNG);
        System.out.println(phone2);

        try{
            System.out.println(phone2.equals(phone));
        } catch (NullPointerException e) {
            System.out.println("We can't compare a null element with an element different from null");
        }

        System.out.println();

        try {
            searchOtherElements();
        }catch (ElementsNotInTheListException e) {
            System.out.println("Elements were not found in DeviceFactory and a custom exception will be raised");
        }
    }

    public static void searchOtherElements() {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device tv2 = deviceFactory.getDevice("Philips 220Z TV", 550.15f, "blue", Manufacturer.PHILIPS);
        Device coffeeMachine2 = deviceFactory.getDevice("Zanussi X3 Coffee Machine", 280.9f, "blue", Manufacturer.ZANUSSI);
        Device owen2 = deviceFactory.getDevice("Owen Incorporated Z20 Zepter", 430.28f, "blue", Manufacturer.ZEPTER);
        Device waterPurifier2 = deviceFactory.getDevice("Water Purifier PWC-987-D3", 225.52f, "blue", Manufacturer.IPHONE);

        List<Device> newDeviceList = Arrays.asList(tv2, coffeeMachine2, owen2, waterPurifier2);
        System.out.println("List of searched elements: " + newDeviceList);

        Collections.sort(newDeviceList, new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) throws ElementsNotInTheListException {
//                return o1.getDeviceColor().charAt(0) - o2.getDeviceColor().charAt(0);
                 throw new ElementsNotInTheListException("List full of nulls - elements not found");
            }
        });
    }
}
