/*Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), колір(String).
Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.*/

package hw2;

public class Car {
    int year;
    String color;

    Car (){
    }
    Car (int year){
        this.year = year;
    }
    Car (int year, String color){
        this.year = year;
        this.color = color;
    }
}
