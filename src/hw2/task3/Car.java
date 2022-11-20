/*Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
Перевантажити конструктори викликаючи конструктор із конструктора.
Створити клас Main, де створити екземляри класу Машина з різними параметрами.*/

package hw2.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car(){}
    Car (int year){
        this.year = year;
    }
    Car (int year, double speed){
        this(5);
        this.speed = speed;

    }
    Car (int year, double speed, int weight){
        this(9,200);
        this.weight = weight;
    }
    Car (int year, double speed, int weight, String color){
        this(15,120,7000);
        this.color = color;
    }
}
