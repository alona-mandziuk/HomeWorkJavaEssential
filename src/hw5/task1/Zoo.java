package hw5.task1;

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
        for (String zo : zoo) {
            System.out.println(zo + " ");
        }
    }
}
