package designPatterns_github.designPatterns_github.decorator;

public class EmergencyRoom extends RegistryDecorator{

    public EmergencyRoom(Hospital hospital) {
        super(hospital);
    }

    @Override
    public void visited() {
        super.visited();
        System.out.println("The pacient visited the emergency room");
    }
}
