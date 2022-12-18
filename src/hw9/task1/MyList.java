package hw9.task1;

import java.util.Arrays;

class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int point = 0;

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, point);
        array = newArray;
    }

    void add(T obj) {
        if (point == array.length - 1) {
            resize(array.length * 2);
        }
        array[point++] = obj;

    }

    T get(int index) {
        return (T) array[index];
    }

    int size() {
        return point;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Strings");
        System.out.println("-----------------------------------");
        MyList<String> myListString = new MyList<>();
        myListString.add("Books: ");
        myListString.add("Harry Potter. J. Rollings");
        myListString.add("Lost Symbol. Den Brown");
        myListString.add("Shining. St. King");
        for (int i = 0; i < myListString.size(); i++) {
            System.out.println(myListString.get(i) + " ");
        }
        System.out.println("The size is: " + myListString.size());
        System.out.println("The element index 1: " + myListString.get(1));
        System.out.println("-----------------------------------");
        System.out.println("Integers");
        System.out.println("-----------------------------------");
        MyList <Integer> myListInteger = new MyList<>();
        myListInteger.add(15);
        myListInteger.add(96);
        myListInteger.add(45);
        myListInteger.add(6515);
        for (int i = 0; i < myListInteger.size(); i++) {
            System.out.println(myListInteger.get(i) + " ");
        }
        System.out.println("The size is: " + myListInteger.size());
        System.out.println("The element index 2: " + myListInteger.get(2));
    }
}
