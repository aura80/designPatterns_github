package designPatterns_github.designPatterns_github.builder_with_internal_public_constructor_static_class;

import java.util.*;

public class ApartmentBuild {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment.ApartmentBuilder("Central", true, 4,
                243000.52D, 3)
                .withPositionEVSN(PositionFinishedApartment.NORTH_WEST)
                .withNoBalcony(2)
                .withNoBathrooms(2)
                .build();
        System.out.println(apartment1);

        Apartment apartment2 = new Apartment.ApartmentBuilder(3, 165000.98, 2,
                PositionFinishedApartment.SOUTH)
                .withTownArea("Intermediate")
                .withIsFinished(true)
                .withNoBalcony(1)
                .withNoBathrooms(2)
                .build();
        System.out.println(apartment2);

        Apartment apartment3 = new Apartment.ApartmentBuilder(2, 75280.13, 5,
                PositionFinishedApartment.SOUTH_WEST)
                .withTownArea("Periferic")
                .withIsFinished(false)
                .withNoBalcony(1)
                .withNoBathrooms(1)
                .build();
        System.out.println(apartment3);

        Apartment apartment4 = new Apartment.ApartmentBuilder(2,65075.32d, 8,
                PositionFinishedApartment.EAST).withIsFinished(true).withTownArea("Central")
                .withNoBathrooms(1).withNoBalcony(1)
                .build();
        String hint = " -> ";
        System.out.println("New added apartment"+ hint + apartment4.getNoRooms() + " " + apartment4.getNoBathrooms()
                + " " + apartment4.getNoBalcony() + " " + apartment4.getLevel()
                + " " + apartment4.getIsFinished() + " " + apartment4.getPositionEVSN2());
        System.out.println(apartment4);

        System.out.println();

        List<Apartment> apartments = Arrays.asList(apartment1, apartment2, apartment3, apartment4);
        String money =  " Euro";
        System.out.println("Total price: " + (apartments.get(0).getPrice() + apartments.get(1).getPrice()
                + apartments.get(2).getPrice() + + apartments.get(3).getPrice() + money));

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose between C, I or P: ");
        String level = "level ";
        String rooms = " rooms ";
        String baths = " bathrooms ";
        String balconies = " balconies ";

        while (scanner.hasNext()) {
            String text = scanner.next();
            switch (text) {
                case "C": case "c": {
                    System.out.println(apartments.get(0).getTownArea() + hint + apartments.get(0).getPrice() + money
                            + hint + level + apartments.get(0).getLevel() + hint + apartments.get(0).getNoRooms()
                            + rooms + hint + apartments.get(0).getNoBalcony() + balconies
                            + hint + apartments.get(0).getNoBathrooms() + baths
                            + hint + apartments.get(0).getPositionEVSN(PositionFinishedApartment.NORTH_WEST)
                            + hint + apartments.get(0).getPositionEVSN2()
                            + hint + apartments.get(0).getIsFinished());
                    System.out.println(apartments.get(3).getTownArea() + hint + apartments.get(3).getPrice() + money
                            + hint + level + apartments.get(3).getLevel() + hint + apartments.get(3).getNoRooms()
                            + rooms + hint + apartments.get(3).getNoBalcony() + balconies
                            + hint + apartments.get(3).getNoBathrooms() + baths
                            + hint + apartments.get(3).getPositionEVSN2()
                            + hint + apartments.get(3).getIsFinished());

                    System.out.print("Total price per central area:    ");
                    System.out.printf("%.2f", apartments.get(0).getPrice() + apartments.get(3).getPrice());
                    System.out.println(" " + money);
                    break;
                }
                case "I": case "i":
                    System.out.println(apartments.get(1).getTownArea() + hint + apartments.get(1).getPrice() + money
                            + hint + level + apartments.get(1).getLevel() + hint + apartments.get(1).getNoRooms()
                            + rooms + hint + apartments.get(1).getNoBalcony() + balconies
                            + hint + apartments.get(1).getNoBathrooms() + baths
                            + hint + apartments.get(1).getPositionEVSN(PositionFinishedApartment.SOUTH)
                            + hint + apartments.get(1).getIsFinished());
                    break;
                case "P": case "p":
                    System.out.println(apartments.get(2).getTownArea() + hint + apartments.get(2).getPrice() + money
                            + hint + level + apartments.get(2).getLevel() + hint + apartments.get(2).getNoRooms()
                            + rooms + hint + apartments.get(2).getNoBalcony() + balconies
                            + hint + apartments.get(2).getNoBathrooms() + baths
                            + hint + apartments.get(2).getPositionEVSN(PositionFinishedApartment.SOUTH_WEST)
                            + hint + apartments.get(2).getIsFinished());
                    break;
                default:
                    if ("E".equalsIgnoreCase(text)) {
                    } else {
                        System.out.println("Introduce the area again: ");
                    }
            }

            if ("E".equalsIgnoreCase(text)) {
                break;
            }
        }
    }
}
