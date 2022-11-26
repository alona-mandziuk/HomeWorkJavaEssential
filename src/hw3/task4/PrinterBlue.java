package hw3.task4;

public class PrinterBlue extends Printer{
    @Override
    void print(String value) {
        System.out.println("\033[0;34m" + value);
    }
}
