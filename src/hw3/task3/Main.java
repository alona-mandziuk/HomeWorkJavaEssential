/*
У тілі методу main() реалізуйте можливість
прийому від користувача номер ключа доступу pro і exp.
Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною
версією (створюється екземпляр базового класу), якщо користувач ввів номери ключа доступу pro і exp,
то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
*/

package hw3.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Do you have the key? Press Y (for YEAS) or N (for NO):");
        String answear = scanner.nextLine();
        if (answear.equalsIgnoreCase("N")) {
            System.out.println("You can use only free version.");
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("What you want to do with the file?");
            System.out.println("Press O (for OPEN), E (EDIT), S (SAVE): ");
            String answear1 = scanner.nextLine();
            if (answear1.equalsIgnoreCase("O")) {
                documentWorker.openDocument();
            } else if (answear1.equalsIgnoreCase("E")) {
                documentWorker.editDocument();
            } else if (answear1.equalsIgnoreCase("S")) {
                documentWorker.saveDocument();
            } else {
                System.out.println("You have input the wrong statement.");
            }
        } else if (answear.equalsIgnoreCase("Y")) {
            System.out.println("Which key do you have? Input P (for Pro), E (Expert): ");
            String answear2 = scanner.nextLine();
            if (answear2.equalsIgnoreCase("P")) {
                System.out.println("You have PRO access.");
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                System.out.println("What you want to do with the file?");
                System.out.println("Press O (for OPEN), E (EDIT), S (SAVE): ");
                String answear3 = scanner.nextLine();
                if (answear3.equalsIgnoreCase("O")) {
                    proDocumentWorker.openDocument();
                } else if (answear3.equalsIgnoreCase("E")) {
                    proDocumentWorker.editDocument();
                } else if (answear3.equalsIgnoreCase("S")) {
                    proDocumentWorker.saveDocument();
                } else {
                    System.out.println("You have input the wrong statement.");
                }
            } else if (answear2.equalsIgnoreCase("E")) {
                System.out.println("You have EXPERT access.");
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                System.out.println("What you want to do with the file?");
                System.out.println("Press O (for OPEN), E (EDIT), S (SAVE): ");
                String answear4 = scanner.nextLine();
                if (answear4.equalsIgnoreCase("O")) {
                    expertDocumentWorker.openDocument();
                } else if (answear4.equalsIgnoreCase("E")) {
                    expertDocumentWorker.editDocument();
                } else if (answear4.equalsIgnoreCase("S")) {
                    expertDocumentWorker.saveDocument();
                } else {
                    System.out.println("You have input the wrong statement.");
                }
            }
        }
        else {
            System.out.println("You have input the wrong statement.");
        }
    }
}
