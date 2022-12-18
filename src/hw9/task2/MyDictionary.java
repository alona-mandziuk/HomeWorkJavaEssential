package hw9.task2;

import java.util.Arrays;
import java.util.Objects;


class MyDictionary<K, V> {

    private static final int DEFAULT_CAPACITY = 10;
    private int point = 0;
    private int capacity = DEFAULT_CAPACITY;
    K key;
    V value;

    MyDictionary() {
    }

    MyDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private MyDictionary<K, V>[] obj = new MyDictionary[capacity];


    MyDictionary<K, V>[] add(K key, V value) {
        if (point == capacity) {
            capacity = capacity * 2;
            obj = Arrays.copyOf(obj, capacity);
        }
        obj[point] = new MyDictionary<>(key, value);
        point++;
        return obj;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDictionary<?, ?> that = (MyDictionary<?, ?>) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }


    MyDictionary<K, V> getByIndex(int index) {
        return obj[index];

    }

    int size() {
        return point;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", value: " + value + '.';
    }
}

class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.add("Cloud", "Небо");
        myDictionary.add("Sun", "Сонце");
        myDictionary.add("Key", "Ключ");
        myDictionary.add("Food", "Їжа");
        for (int i = 0; i < myDictionary.size(); i++) {
            System.out.println(myDictionary.getByIndex(i) + " ");
        }
        System.out.println("Size of the dictionary is " + myDictionary.size());
        System.out.println("Get the statement by index 2: " + myDictionary.getByIndex(2));

    }
}
