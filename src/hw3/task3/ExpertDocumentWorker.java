/*Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker.
Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран
документ збережений в новому форматі.*/

package hw3.task3;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("The document is saved in the new format.");
    }
}
