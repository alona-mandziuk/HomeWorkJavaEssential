package hw4.task1;

class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("The XML-file has been opened.");
    }

    @Override
    void create() {
        System.out.println("The XML-file has been created.");
    }

    @Override
    void change() {
        System.out.println("The XML-file has been changed.");
    }

    @Override
    void save() {
        System.out.println("The XML-file has been saved.");
    }
}
