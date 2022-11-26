/*
Створіть похідний клас ProDocumentWorker.
Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки:
"Документ відредаговано", "Документ збережено у старому форматі,
збереження в інших форматах доступне у версії Експерт".
 */

package hw3.task3;

class ProDocumentWorker extends DocumentWorker {

    @Override
    void editDocument() {
        System.out.println("Document is edited.");
    }

    @Override
    void saveDocument() {
        System.out.println("Document is saved in the old format, " +
                "another formats are available in Expert version.");
    }
}
