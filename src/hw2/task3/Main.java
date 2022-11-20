package hw2.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(8);
        System.out.println(car2.year);
        Car car3 = new Car (5, 110);
        System.out.println(car3.year + " " + car3.speed);
        Car car4 = new Car(5,100,2100);
        System.out.println(car4.year + " " + car4.speed + " " + car4.weight);
        Car car5 = new Car(25,80,5200, "Black");
        System.out.println(car5.year + " " + car5.speed + " " + car5.weight + " " + car5.color);
    }
}
