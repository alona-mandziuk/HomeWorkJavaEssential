/* Використовуючи IDEA, створіть проект із пакетом.
Потрібно: Створити клас Book (Main). Створити класи Title, Author та Content,
кожен з яких повинен містити одне рядкове поле та метод void show().
Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
 Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст. */

package hw1.task2;

public class Book {
    Author author = new Author();
    Title title = new Title();
    Content content = new Content();

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    void show() {
        System.out.println("------------------------------");
        System.out.println(author.getAuthor() + "\n" + title.getTitle() + "\n" + content.getContent());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Author author1 = new Author("Joan Roling");
        Title title1 = new Title("'Harry Potter and the Order of the Phoenix.'");
        Content content1 = new Content("It follows Harry Potter's struggles through his " +
                "\nfifth year at Hogwarts School of Witchcraft and Wizardry, " +
                "\nincluding the surreptitious return of the antagonist Lord Voldemort, " +
                "\nO.W.L. exams, and an obstructive Ministry of Magic.");
        Book book = new Book(author1, title1, content1);
        book.show();

    }
}
