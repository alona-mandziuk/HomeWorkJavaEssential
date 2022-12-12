package hw8.task1;

class Device {

    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    protected Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    protected Device() {
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
}
