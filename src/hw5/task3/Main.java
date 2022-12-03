package hw5.task3;

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(55);
        array.add(85);
        array.add(87);
        array.add(5);
        array.add(101);
        array.add(202);
        System.out.println("--------------------------");
        System.out.println(array);
        System.out.println("--------------------------");
        ListIterator<Integer> iterator = array.listIterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next() + 1;
            System.out.print(i + " ");
        }
    }
}
