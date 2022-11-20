package hw1.task2;

public class Author {
    String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Author() {
    }

    void show (){
        System.out.println(getAuthor());
    }
}
