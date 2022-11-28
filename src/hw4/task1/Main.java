package hw4.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("Input the name and extension of the file, you want to work with: ");
        Scanner scanner = new Scanner(System.in);
        String extension = scanner.nextLine();
        String extensionNoCase = extension.toLowerCase();
        if (extensionNoCase.matches("(.*).doc")) {
            DOCHandler docHandler = new DOCHandler();
            System.out.println("It is a DOC file.");
            System.out.println("-------------------------------------");
            System.out.println("Choose the activity with your file, press the button: ");
            System.out.println("-------------------------------------");
            System.out.println("1 (open) / 2 (create) / 3 (change) / 4 (save)");
            System.out.println("-------------------------------------");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    docHandler.open();
                    break;
                case 2:
                    docHandler.create();
                    break;
                case 3:
                    docHandler.change();
                    break;
                case 4:
                    docHandler.save();
                    break;
            }
        } else if (extensionNoCase.matches("(.*).txt")) {
            TXTHandler txtHandler = new TXTHandler();
            System.out.println("It is a TXT file.");
            System.out.println("-------------------------------------");
            System.out.println("Choose the activity with your file, press the button: ");
            System.out.println("-------------------------------------");
            System.out.println("1 (open) / 2 (create) / 3 (change) / 4 (save)");
            System.out.println("-------------------------------------");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    txtHandler.open();
                    break;
                case 2:
                    txtHandler.create();
                    break;
                case 3:
                    txtHandler.change();
                    break;
                case 4:
                    txtHandler.save();
                    break;
            }
        }else if (extensionNoCase.matches("(.*).xml")){
            XMLHandler xmlHandler = new XMLHandler();
            System.out.println("It is a XML file.");
            System.out.println("-------------------------------------");
            System.out.println("Choose the activity with your file, press the button: ");
            System.out.println("-------------------------------------");
            System.out.println("1 (open) / 2 (create) / 3 (change) / 4 (save)");
            System.out.println("-------------------------------------");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    xmlHandler.open();
                    break;
                case 2:
                    xmlHandler.create();
                    break;
                case 3:
                    xmlHandler.change();
                    break;
                case 4:
                    xmlHandler.save();
                    break;
            }
        }else {
            System.out.println("Wrong file extension.");
        }
        System.out.println("**************************************************");
    }
}
