package hw6.task2;

enum Vehicle {
    AUDI (10000, "Black"),
    VOLKSWAGEN (8000, "Blue"),
    BMV (15000, "Red"),
    TESLA (50000, "White"),
    FORD (25000, "Green");

    int price;
    String color;

    Vehicle(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle: " + super.toString() + ", price: " + price +
                " usd, color: " + color +'.';
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = Vehicle.AUDI;
        Vehicle vehicle2 = Vehicle.BMV;
        Vehicle vehicle3 = Vehicle.FORD;
        Vehicle vehicle4 = Vehicle.TESLA;
        Vehicle vehicle5 = Vehicle.VOLKSWAGEN;
        System.out.println("----------------------------------");
        System.out.println("1. " + vehicle1);
        System.out.println("2. " + vehicle2);
        System.out.println("3. " + vehicle3);
        System.out.println("4. " + vehicle4);
        System.out.println("5. " + vehicle5);
        System.out.println("----------------------------------");
    }
}
