package designPatterns_github.designPatterns_github.factory2_with_enums;

import java.util.Objects;

public class DevicePhone implements Device{
    private String deviceName;
    private float devicePrice;
    private String deviceColor;
    Manufacturer deviceManufacturer;

    public DevicePhone(String deviceName, float devicePrice, String deviceColor, Manufacturer deviceManufacturer) {
        this.deviceName = deviceName;
        this.devicePrice = devicePrice;
        this.deviceColor = deviceColor;
        this.deviceManufacturer = deviceManufacturer;
    }

    @Override
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override
    public float getDevicePrice() {
        return this.devicePrice;
    }

    @Override
    public String getDeviceColor() {
        return this.deviceColor;
    }

    @Override
    public Manufacturer getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "deviceName='" + deviceName + '\'' +
                ", devicePrice=" + devicePrice +
                ", deviceColor='" + deviceColor + '\'' +
                ", deviceManufacturer=" + deviceManufacturer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevicePhone that = (DevicePhone) o;
        return Float.compare(that.devicePrice, devicePrice) == 0 && Objects.equals(deviceName, that.deviceName) && Objects.equals(deviceColor, that.deviceColor) && deviceManufacturer == that.deviceManufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceName, devicePrice, deviceColor, deviceManufacturer);
    }
}
