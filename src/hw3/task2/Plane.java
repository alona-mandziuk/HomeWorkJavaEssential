package hw3.task2;

public class Plane extends Vehicle {
    /*
    Для класу Plane має бути визначена висота та кількість пасажирів.
    */
    int high = 0;
    int passengers = 0;


    public Plane(int coordinate, int price, int speed, int year, int high, int passengers) {
        super(coordinate, price, speed, year);
        this.high = high;
        this.passengers = passengers;
    }

    @Override
    void show() {
        super.show();
        System.out.println("High: " + high);
        System.out.println("Passengers: " + passengers);
    }
}

