package designPatterns_github.designPatterns_github.factory2;

public interface Device {
    String getDeviceName();
    float getDevicePrice();
    String getDeviceColor();
    Manufacturer getDeviceManufacturer();
}
