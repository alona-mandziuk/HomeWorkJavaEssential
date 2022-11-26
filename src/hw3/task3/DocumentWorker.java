/*
Потрібно: Створити клас DocumentWorker.
У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
У тілі кожного з методів додайте виведення на екран відповідних рядків:
"Документ відкритий", "Правка документа доступна у версії Про",
"Збереження документа доступне у версії Про".
* */

package hw3.task3;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Document is open.");
    }

    void editDocument() {
        System.out.println("You can edit the document only in Pro version.");
    }

    void saveDocument() {
        System.out.println("You can save the document only in Pro version.");
    }
}
