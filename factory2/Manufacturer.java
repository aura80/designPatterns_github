package designPatterns_github.designPatterns_github.factory2;

public enum Manufacturer implements HardCodedMessages{
    SAMSUNG(HardCodedMessages.ledSamsungTV),
    PHILIPS(HardCodedMessages.coffeeMachine),
    ZANUSSI(HardCodedMessages.owenZanussi),
    IPHONE(HardCodedMessages.iPhone),
    ZEPTER(HardCodedMessages.waterPurifier);

    private String message;
    Manufacturer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
