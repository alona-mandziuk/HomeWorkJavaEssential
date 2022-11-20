package hw2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Input the radius of the circle: ");
        float radius = scanner.nextFloat();
        System.out.println("The area of the circle is: " + MyArea.AreaOfCircle(radius));

    }
}
