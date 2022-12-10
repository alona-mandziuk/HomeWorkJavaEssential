package hw7.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class YearException extends Exception {
    public void yearException() {
        System.out.println("The wrong year type!");
    }
}

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
        return "Worker - " + surnameAndInitials + ", position '" + position + '\'' +
                ", year of start - " + startYear +
                '.';
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Worker> workers = new ArrayList<>(5);
        Scanner scanner1 = new Scanner(System.in);
        int currentYear = 2022;
        int beginCompanyYear = 1995;
        System.out.println("--------------------1");
        System.out.println("Input the surname and initials of the 1st worker: ");
        String name1 = scanner1.nextLine();
        System.out.println("Input the position: ");
        String position1 = scanner1.nextLine();
        int year1;
        do {
            System.out.println("Input the year of the work start: ");
            year1 = scanner1.nextInt();
            try {
                if (year1 < beginCompanyYear || year1 > currentYear)
                    throw new YearException();
            } catch (YearException e) {
                e.yearException();
            }
            if (year1 >= beginCompanyYear & year1 <= currentYear)
                break;
        } while (true);


        Worker worker1 = new Worker(name1, position1, year1);
        workers.add(worker1);
        System.out.println(worker1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("--------------------2");
        System.out.println("Input the surname and initials of the 2nd worker: ");
        String name2 = scanner2.nextLine();
        System.out.println("Input the position: ");
        String position2 = scanner2.nextLine();
        int year2;
        do {
            System.out.println("Input the year of the work start: ");
            year2 = scanner2.nextInt();
            try {
                if (year2 < beginCompanyYear || year2 > currentYear)
                    throw new YearException();
            } catch (YearException e) {
                e.yearException();
            }
            if (year2 >= beginCompanyYear & year2 <= currentYear)
                break;
        } while (true);

        Worker worker2 = new Worker(name2, position2, year2);
        workers.add(worker2);
        System.out.println(worker2);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("--------------------3");
        System.out.println("Input the surname and initials of the 3d worker: ");
        String name3 = scanner3.nextLine();
        System.out.println("Input the position: ");
        String position3 = scanner3.nextLine();
        int year3;
        do {
            System.out.println("Input the year of the work start: ");
            year3 = scanner3.nextInt();
            try {
                if (year3 < beginCompanyYear || year3 > currentYear)
                    throw new YearException();
            } catch (YearException e) {
                e.yearException();
            }
            if (year3 >= beginCompanyYear & year3 <= currentYear)
                break;
        } while (true);

        Worker worker3 = new Worker(name3, position3, year3);
        workers.add(worker3);
        System.out.println(worker3);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("--------------------4");
        System.out.println("Input the surname and initials of the 4th worker: ");
        String name4 = scanner4.nextLine();
        System.out.println("Input the position: ");
        String position4 = scanner4.nextLine();
        int year4;
        do {
            System.out.println("Input the year of the work start: ");
            year4 = scanner4.nextInt();
            try {
                if (year4 < beginCompanyYear || year4 > currentYear)
                    throw new YearException();
            } catch (YearException e) {
                e.yearException();
            }
            if (year4 >= beginCompanyYear & year4 <= currentYear)
                break;
        } while (true);

        Worker worker4 = new Worker(name4, position4, year4);
        workers.add(worker4);
        System.out.println(worker4);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("--------------------5");
        System.out.println("Input the surname and initials of the 5th worker: ");
        String name5 = scanner5.nextLine();
        System.out.println("Input the position: ");
        String position5 = scanner5.nextLine();
        int year5;
        do {
            System.out.println("Input the year of the work start: ");
            year5 = scanner5.nextInt();
            try {
                if (year5 < beginCompanyYear || year5 > currentYear)
                    throw new YearException();
            } catch (YearException e) {
                e.yearException();
            }
            if (year5 >= beginCompanyYear & year5 <= currentYear)
                break;
        } while (true);

        Worker worker5 = new Worker(name5, position5, year5);
        workers.add(worker5);
        System.out.println(worker5);
        System.out.println("------------------------------");
        System.out.println("The list of the workers: ");
        Collections.sort(workers, new Comparator<>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.surnameAndInitials.compareTo(o2.surnameAndInitials);
            }
        });

        for (Worker w : workers) {
            System.out.println(w + " ");
        }
        System.out.println("-------------------------");
        System.out.println("Input the year experience.");
        Scanner scanner6 = new Scanner(System.in);
        int experience = scanner6.nextInt();
        for (int i = 0; i < workers.size(); i++) {
            if ((currentYear - workers.get(i).startYear) >= experience) {
                System.out.println(workers.get(i).surnameAndInitials + " ");
            }
        }
    }
}
