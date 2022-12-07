package hw7.task1;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Worker {
    String surnameAndInitials;
    String position;
    int startYear;

    public Worker(String surnameAndInitials, String position, int startYear) {
        this.surnameAndInitials = surnameAndInitials;
        this.position = position;
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Worker " + surnameAndInitials + ", position '" + position + '\'' +
                ", year of start " + startYear +
                '.';
    }
}
class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <Worker> workers = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------1");
        System.out.println("Input the surname and initials of the 1st worker: ");
        String name1 = scanner.nextLine();
        System.out.println("Input the position: ");
        String position1 = scanner.nextLine();
        System.out.println("Input the year of the work start: ");
        int year1 = scanner.nextInt();
            if (year1 < 1995 && year1 > 2022) {
                throw new Exception("The wrong year type!");
            }



        Worker worker1 = new Worker(name1,position1,year1);
        workers.add(worker1);


        System.out.println("--------------------2");
        System.out.println("Input the surname and initials of the 2nd worker: ");
        String name2 = scanner.next();
        System.out.println("Input the position: ");
        String position2 = scanner.next();
        System.out.println("Input the year of the work start: ");
        int year2 = scanner.nextInt();
        Worker worker2 = new Worker(name2, position2, year2);
        workers.add(worker2);

        System.out.println("--------------------3");
        System.out.println("Input the surname and initials of the 3d worker: ");
        String name3 = scanner.next();
        System.out.println("Input the position: ");
        String position3 = scanner.next();
        System.out.println("Input the year of the work start: ");
        int year3 = scanner.nextInt();
        Worker worker3 = new Worker(name3,position3,year3);
        workers.add(worker3);

        System.out.println("--------------------4");
        System.out.println("Input the surname and initials of the 4th worker: ");
        String name4 = scanner.next();
        System.out.println("Input the position: ");
        String position4 = scanner.next();
        System.out.println("Input the year of the work start: ");
        int year4 = scanner.nextInt();
        Worker worker4 = new Worker(name4, position4,year4);
        workers.add(worker4);

        System.out.println("--------------------5");
        System.out.println("Input the surname and initials of the 5th worker: ");
        String name5 = scanner.next();
        System.out.println("Input the position: ");
        String position5 = scanner.next();
        System.out.println("Input the year of the work start: ");
        int year5 = scanner.nextInt();
        Worker worker5 = new Worker(name5,position5,year5);
        workers.add(worker5);
        System.out.println("------------------------------");
        System.out.println("The list of the workers: ");
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.surnameAndInitials.compareTo(o2.surnameAndInitials);
            }
        });


        for (Worker w: workers) {
            System.out.println(w + " ");

        }
    }
}