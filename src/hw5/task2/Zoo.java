package hw5.task2;

import java.util.ArrayList;

class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Lion");
        zoo.add(1, "Wolf");
        zoo.add(2, "Bear");
        zoo.add(3, "Fox");
        zoo.add(4, "Giraffe");
        zoo.add(5, "Koala");
        zoo.add(6, "Strauss");
        zoo.add(7, "Tiger");
        System.out.println("--------------------");
        System.out.println(zoo);
        System.out.println("--------------------");
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);

        System.out.println("The size of the list after removing: " + zoo.size());
        System.out.println("--------------------");
        System.out.println(zoo);
        System.out.println("--------------------");

    }
}
