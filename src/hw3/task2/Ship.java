package hw3.task2;
/*
Для класу Ship – кількість пасажирів та порт приписки.
 */
public class Ship extends Vehicle {
    int passengers = 0;
    int port = 0;

    public Ship(int coordinate, int price, int speed, int year, int passengers, int port) {
        super(coordinate, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Passengers : " + passengers);
        System.out.println("Port: " + port);
    }
}
