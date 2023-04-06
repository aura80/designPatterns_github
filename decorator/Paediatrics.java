package designPatterns_github.designPatterns_github.decorator;

public class Paediatrics extends RegistryDecorator {

    public Paediatrics(Hospital hospital) {
        super(hospital);
    }

    @Override
    public void visited() {
        super.visited();
        System.out.println("The pacient visited the paediatrician");
    }
}
