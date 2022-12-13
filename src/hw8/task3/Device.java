package hw8.task3;

import java.util.Objects;

class Device {

    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    protected Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0
                && Objects.equals(manufacturer, device.manufacturer) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}

class EthernetAdapter {
    int speed;
    String mac;

    EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }
}

class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;
    private int speed;
    private String mac;
    EthernetAdapter ethernetAdapter = new EthernetAdapter(speed, mac);

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public EthernetAdapter getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(EthernetAdapter ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    public Monitor(String manufacturer, float price, String serialNumber,
                   int resolutionX, int resolutionY, EthernetAdapter ethernetAdapter) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY
                && speed == monitor.speed && Objects.equals(mac, monitor.mac)
                && Objects.equals(ethernetAdapter, monitor.ethernetAdapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY, speed, mac, ethernetAdapter);
    }
}

class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Sony", 1500, "1313546846");
        Device device2 = new Device("Sony", 1500, "1313546846");
        EthernetAdapter ethernetAdapter = new EthernetAdapter(300, "01:23:45:67:89:AB");
        Monitor monitor1 = new Monitor("Dell", 2000, "26232362362612651",
                120, 240, ethernetAdapter);
        Monitor monitor2 = new Monitor("Dell", 2000, "26232362362612651",
                120, 240, ethernetAdapter);
        Monitor monitor3 = new Monitor("Dell", 3000, "111112362362612651",
                120, 240, ethernetAdapter);
        System.out.println("--------------------------------------------");
        System.out.println("Device 1 hashCode: " + device1.hashCode());
        System.out.println("Device 2 hashCode: " + device2.hashCode());
        System.out.println("Device 1 == Device 2 ? : " + device1.equals(device2));
        System.out.println("Monitor 1 hashCode: " + monitor1.hashCode());
        System.out.println("Monitor 2 hashCode: " + monitor2.hashCode());
        System.out.println("Monitor 3 hashCode: " + monitor3.hashCode());
        System.out.println("Monitor 1 == Monitor 2 ? : " + monitor1.equals(monitor2));
        System.out.println("Monitor 2 == Monitor 3 ? : " + monitor2.equals(monitor3));
        System.out.println("--------------------------------------------");

    }
}