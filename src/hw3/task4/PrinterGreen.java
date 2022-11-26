package hw3.task4;

public class PrinterGreen extends Printer{
    @Override
    void print(String value) {
        System.out.println("\033[0;32m" + value);
    }
}
