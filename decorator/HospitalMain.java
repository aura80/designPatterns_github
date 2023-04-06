package designPatterns_github.designPatterns_github.decorator;

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Doorman();
        hospital.visited();
        System.out.println();
        Hospital hospital1 = new Chirurgie(new Doorman());
        hospital1.visited();
        System.out.println();
        Hospital hospital2 = new Paediatrics(new Chirurgie(new Doorman()));
        hospital2.visited();
        System.out.println();
        Hospital hospital3 = new Paediatrics(new Chirurgie(new EmergencyRoom(new Doorman())));
        hospital3.visited();
        System.out.println();
        Hospital hospital4 = new Chirurgie(new Paediatrics(new EmergencyRoom(new Doorman())));
        hospital4.visited();
        System.out.println();
        Hospital hospital5 = new OutDoor(new Paediatrics(new Chirurgie(new EmergencyRoom(new Doorman()))));
        hospital5.visited();
    }
}
