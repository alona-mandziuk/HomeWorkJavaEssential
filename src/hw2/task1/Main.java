package hw2.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(7);
        Car car3 = new Car(10, "Black");
        System.out.println(car1.year + " " + car1.color);
        System.out.println(car2.year + " " + car2.color);
        System.out.println(car3.year + " " + car3.color);
    }
}

