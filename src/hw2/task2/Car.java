/*Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
Перевантажити конструктори. Створити клас Main, де створити екземляри класу Машина з різними параметрами.*/

package hw2.task2;

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
        this.year = year;
        this.speed = speed;
    }
    Car (int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    Car (int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight= weight;
        this.color = color;
    }

}
