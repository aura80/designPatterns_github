package designPatterns_github.designPatterns_github.decorator;

public class RegistryDecorator implements Hospital {
    protected Hospital hospital;

    public RegistryDecorator(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public void visited() {
        this.hospital.visited();
    }
}
