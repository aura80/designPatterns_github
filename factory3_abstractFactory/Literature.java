package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public abstract class Literature extends AbstractLibrary{
    private String depositRoom;
    private int level;

    public Literature(String depositRoom, int level) {
        this.depositRoom = depositRoom;
        this.level = level;
    }

    public String getDepositRoom() {
        return this.depositRoom;
    }

    public int getLevel() {
        return this.level;
    }
}
