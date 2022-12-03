package hw5.task4;

import java.util.ArrayList;
import java.util.Collections;

class Friends {
    public static void main(String[] args) {
        ArrayList <String> friends = new ArrayList<>();
        friends.add("Monika");
        friends.add("Rachel");
        friends.add("Phoebe");
        friends.add("Joe");
        friends.add("Ross");
        friends.add("Chandler");
        System.out.println("----------------------------------");
        System.out.println("Before sorting: " + friends);
        Collections.sort(friends);
        System.out.println("Sorted alphabetically: " + friends);
    }
}
