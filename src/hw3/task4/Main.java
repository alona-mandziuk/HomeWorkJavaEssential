package hw3.task4;

class Main {
    public static void main(String[] args) {
        String value = "TEST TEXT";
        Printer printer = new Printer();
        printer.print(value);
        PrinterGreen printerGreen = new PrinterGreen();
        printerGreen.print(value);
        PrinterYellow printerYellow = new PrinterYellow();
        printerYellow.print(value);
        PrinterBlue printerBlue = new PrinterBlue();
        printerBlue.print(value);
        PrinterMagenta printerMagenta = new PrinterMagenta();
        printerMagenta.print(value);
        Printer printer1 = printerBlue;
        printer1.print(value);

    }
}
