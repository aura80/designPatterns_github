package designPatterns_github.designPatterns_github.decorator;

public class Chirurgie extends RegistryDecorator {

    public Chirurgie(Hospital hospital) {
        super(hospital);
    }

    @Override
    public void visited() {
        super.visited();
        System.out.println("The pacient visited the surgeon");
    }
}
