package designPatterns_github.designPatterns_github.decorator;

public class Doorman implements Hospital {
    @Override
    public void visited() {
        System.out.println("The pacient passed the hospital's doorman");
    }
}
