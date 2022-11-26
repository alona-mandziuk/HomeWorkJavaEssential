package hw3.task4;

public class PrinterMagenta extends Printer{
    @Override
    void print(String value) {
        System.out.println("\033[0;35m" + value);
    }
}
