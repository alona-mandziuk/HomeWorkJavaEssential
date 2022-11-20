package hw1.task2;

public class Content {
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Content(String content) {
        this.content = content;
    }

    public Content() {
    }

    void show (){
        System.out.println(getContent());
    }
}
