package designPatterns_github.designPatterns_github.factory2;

public class DeviceFactory {
    public DeviceFactory() {
        System.out.println(HardCodedMessages.searchDevice);
    }

    public Device getDevice(String deviceName, float devicePrice, String deviceColor, Manufacturer deviceManufacturer) {
        System.out.println("You searched for \'" + deviceName + "\' from " + deviceManufacturer);

        if (deviceName.equalsIgnoreCase(Manufacturer.IPHONE.getMessage())) {
            return new DevicePhone(deviceName, devicePrice, deviceColor, deviceManufacturer);
        }
        if (deviceName.equalsIgnoreCase(Manufacturer.SAMSUNG.getMessage())) {
            return new DeviceTV(deviceName, devicePrice, deviceColor, deviceManufacturer);
        }
        if (deviceName.equalsIgnoreCase(Manufacturer.PHILIPS.getMessage())) {
            return new DeviceCoffeeMachine(deviceName, devicePrice, deviceColor, deviceManufacturer);
        }
        if (deviceName.equalsIgnoreCase(Manufacturer.ZANUSSI.getMessage())) {
            return new DeviceOwen(deviceName, devicePrice, deviceColor, deviceManufacturer);
        }
        if (deviceName.equalsIgnoreCase(Manufacturer.ZEPTER.getMessage())) {
            return new DeviceWaterPurifier(deviceName, devicePrice, deviceColor, deviceManufacturer);
        }

        return null;
    }
}
