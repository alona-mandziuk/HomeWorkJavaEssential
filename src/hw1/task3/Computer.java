/*Використовуючи IDEA, створіть проект із пакетом.
 Створити клас Computer, створити масив об'єктів Computers розміром 5.
Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).*/

package hw1.task3;

public class Computer {
    String computer;

    public Computer(String computer) {
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }

    public static void main(String[] args) {
        Computer [] computers = new Computer[5];
        computers [0] = new Computer("HP");
        computers [1] = new Computer("Acer");
        computers [2] = new Computer("MacBook");
        computers [3] = new Computer("Asus");
        computers [4] = new Computer("Sony");
        System.out.println("------------------------------");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getComputer() + " ");

        }
        System.out.println("------------------------------");


    }
}
