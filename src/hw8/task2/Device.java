package hw8.task2;
class Device {

    protected String manufacturer = "Samsung";
    protected float price = 120F;
    protected String serialNumber = "AB1234567CD";

    protected Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    protected Device() {
    }

    @Override
    public String toString() {
        return "Device:" + "manufacturer = " + manufacturer +", price = " + price +
                ", serialNumber = " + serialNumber + ".";
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

    private int resolutionX = 1280;
    private int resolutionY = 1024;
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

    public Monitor() {
    }

    @Override
    public String toString() {
        return "Device: " + "manufacturer = " + manufacturer +", price = " + price +
                ", serialNumber = " + serialNumber  +
                ", X = " + resolutionX +
                ", Y = " + resolutionY + '.';
    }

    public static void main(String[] args) {
        Device device = new Monitor();
        System.out.println(device);
    }
}
