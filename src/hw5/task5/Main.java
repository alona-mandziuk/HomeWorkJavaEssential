package hw5.task5;

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        String math = "Марія Математичка";
        String physics = "Софія Фізичка";
        String geography = "Іванна Географічка";
        String inform = "Ірина Інформатичка";
        String pt = "Пан Фізрук";
        String english = "Місс Англічанка";
        String ukrainian = "Пані Укрмова";
        String literature = "Тетяна Література";
        teachers.add(math);
        teachers.add(physics);
        teachers.add(geography);
        teachers.add(inform);
        teachers.add(pt);
        teachers.add(english);
        teachers.add(ukrainian);
        teachers.add(literature);
        System.out.println("--------------------------------------");
        ListIterator iterator = teachers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");
        System.out.println("Індекс найкращого вчителя: " + teachers.indexOf(math));
        System.out.println("Індекс самого не дуже вчителя: " + teachers.indexOf(inform));
        System.out.println("--------------------------------------");

    }
}
