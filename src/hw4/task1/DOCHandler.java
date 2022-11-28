package hw4.task1;
class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("The DOC-file has been opened.");
    }

    @Override
    void create() {
        System.out.println("The DOC-file has been created.");
    }

    @Override
    void change() {
        System.out.println("The DOC-file has been changed.");
    }

    @Override
    void save() {
        System.out.println("The DOC-file has been saved.");
    }
}
