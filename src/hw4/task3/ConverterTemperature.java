package hw4.task3;

import java.util.Scanner;

public class ConverterTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Choose the converter: ");
        System.out.println("---to Fahrenheit - 1");
        System.out.println("---to Kelvin - 2");
        int choiseConverter = scanner.nextInt();
        if (choiseConverter == 1){
            ConvertToFarenheit convertToFarenheit = new ConvertToFarenheit();
            System.out.println("Input the temperature in Celcius:");
            double temperature1 = scanner.nextDouble();
            System.out.println("The temperature in F: " + convertToFarenheit.convert(temperature1));
        }else if (choiseConverter == 2){
            ConvertToKelvin convertToKelvin = new ConvertToKelvin();
            System.out.println("Input the temperature in Celcius:");
            double temperature2 = scanner.nextDouble();
            System.out.println("The temperature in K: " + convertToKelvin.convert(temperature2));
        }else {
            System.out.println("The wrong statement.");
        }
        System.out.println("------------------------------");
    }
}
