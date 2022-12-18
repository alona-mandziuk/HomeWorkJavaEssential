package hw9.task3;

    class MyClass<T> {
    private T data;

    public MyClass(T data) {
        this.data = data;
    }

    public MyClass() {
    }

    public static <T> MyClass<T> newMyClass(T data) {
        return new MyClass<T>(data);
    }

    @Override
    public String toString() {
        return "MyClass " + "data is - " + data + '.';
    }
}

    class Cookies {
    String cookieType;

    Cookies(String cookieType) {
        this.cookieType = cookieType;
    }

    @Override
    public String toString() {
        return " " + cookieType;
    }
}

    class Main extends MyClass {

    public static void main(String[] args) {
        System.out.println("String data\n" + newMyClass("Factory Method"));
        System.out.println("Object data\n" + newMyClass(new Cookies("Chocolate cookies")));
        Cookies cookies = new Cookies("Vanilla cookie");
        System.out.println("Object data\n" + newMyClass(cookies));
        System.out.println("Double data: " + newMyClass(3.14));
    }
}
