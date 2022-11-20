package hw1.task2;

public class Title {
     String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Title(String title) {
        this.title = title;
    }

    public Title() {
    }

    void show (){
        System.out.println(getTitle());
    }
}
