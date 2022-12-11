package hw7.task3;

import java.util.Scanner;

class Calculator {
    double var1;
    double var2;
    double result;

    double add(double var1, double var2) {
        result = var1 + var2;
        return result;
    }

    double sub(double var1, double var2) {
        result = var1 - var2;
        return result;
    }

    double mul(double var1, double var2) {
        result = var1 * var2;
        return result;
    }

    double div(double var1, double var2) {
        try {
            result = var1 / var2;
        } catch (ArithmeticException e) {
            System.out.println("You may not divide to 0.");

        }
        return result;
    }
}

class WrongOperationException extends Exception {
    void wrongOperationException() {
        System.out.println("Wrong operation have been chosen!");
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("---------------------------------------------------");
        System.out.println("------CONSOLE CALCULATOR------");
        System.out.println("Input the first variable: ");
        double var1 = scanner.nextDouble();
        System.out.println("Input the second variable: ");
        double var2 = scanner.nextDouble();
        do {
            System.out.println("Choose the operation: +, -, *, / ");
            String operation = scanner.next();
            try {
                if (operation.equals("+")) {
                    System.out.println(calculator.add(var1, var2));
                } else if (operation.equals("-")) {
                    System.out.println(calculator.sub(var1, var2));
                } else if (operation.equals("*")) {
                    System.out.println(calculator.mul(var1, var2));
                } else if (operation.equals("/")) {
                    System.out.println(calculator.div(var1, var2));

                } else throw new WrongOperationException();
            } catch (WrongOperationException e) {
                e.wrongOperationException();
            }
            if (operation.equals("+") || operation.equals("-") || operation.equals("*")
                    || operation.equals("/")) {
                break;
            }
        } while (true);

    }
}
