package designPatterns_github.designPatterns_github.decorator;

public class OutDoor extends RegistryDecorator{
    public OutDoor(Hospital hospital) {
        super(hospital);
    }

    @Override
    public void visited() {
        super.visited();
        System.out.println("The pacient is cured and he walks out the door");
    }
}
