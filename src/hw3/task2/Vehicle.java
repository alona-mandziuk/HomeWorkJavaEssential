/* Використовуючи IntelliJ IDEA, створіть проект.
Потрібно: Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден
(ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
Для класу Plane має бути визначена висота та кількість пасажирів.
Для класу Ship – кількість пасажирів та порт приписки. Написати програму,
яка виводить на екран інформацію про кожен засіб пересування. */

package hw3.task2;
/*Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден
(ціна, швидкість, рік випуску).*/

class Vehicle {
    int coordinate = 0;
    int price = 0;
    int speed = 0;
    int year = 0;

    public Vehicle() {
    }

    public Vehicle(int coordinate, int price, int speed, int year) {
        this.coordinate = coordinate;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    void show (){
        System.out.println("Coordinate: " + coordinate);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
    }

}
