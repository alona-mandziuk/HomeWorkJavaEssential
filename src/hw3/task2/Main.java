package hw3.task2;
/*Написати програму,
яка виводить на екран інформацію про кожен засіб пересування.*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car(56554, 20000, 200, 1993);
        Plane plane = new Plane(454521, 90000000, 500, 2011, 20, 1235);
        Ship ship = new Ship(112151, 800050000, 100, 2020, 2000, 404);
        System.out.println("--------------------------------");
        System.out.println("------------Car-------------");
        car.show();
        System.out.println("------------Plane-------------");
        plane.show();
        System.out.println("------------Ship-------------");
        ship.show();
        System.out.println("--------------------------------");
    }
}

