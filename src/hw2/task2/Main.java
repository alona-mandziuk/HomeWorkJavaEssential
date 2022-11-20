package hw2.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.color + " "+ car1.speed + " " + car1.weight + " " + car1.year);
        Car car2 = new Car(7);
        System.out.println(car2.color + " "+ car2.speed + " " + car2.weight + " " + car2.year);
        Car car3 = new Car(5, 250);
        System.out.println(car3.color + " "+ car3.speed + " " + car3.weight + " " + car3.year);
        Car car4 = new Car(10, 100, 3000);
        System.out.println(car4.color + " "+ car4.speed + " " + car4.weight + " " + car4.year);
        Car car5 = new Car(1,300,5000,"yellow");
        System.out.println(car5.color + " "+ car5.speed + " " + car5.weight + " " + car5.year);
    }
}
