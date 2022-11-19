//Використовуючи IDEA, створіть проект із пакетом.
// Потрібно: Створити клас із ім'ям Rectangle. У тілі класу створити два поля,
// що описують довжини сторін double side1, double side2.
// Створити два методи, що обчислюють площу прямокутника - double areaCalculator
// (double side1, double side2) і периметр прямокутника - double perimeterCalculator
// (double side1, double side2). Написати програму, яка приймає від користувача довжини
// двох сторін прямокутника і виводить на екран периметр та площу.


package hw1.task1;

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    public Rectangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public double perimeterCalculator(double side1, double side2) {
        double perimeter = 2 * (side1 + side2);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Rectangle-------");
        System.out.print("Input the 1st side: ");
        double side1 = scanner.nextDouble();
        rectangle.setSide1(side1);
        System.out.print("Input the 2nd side: ");
        double side2 = scanner.nextDouble();
        rectangle.setSide2(side2);
        System.out.print("The area = " + rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.print("\nThe perimeter = " + rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println("\n-----------------------");
    }

}
