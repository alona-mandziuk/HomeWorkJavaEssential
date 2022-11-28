package hw4.task2;

import java.util.Scanner;

class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("It's playing.....");
    }

    @Override
    public void pause() {
        System.out.println("Paused.....");
    }

    @Override
    public void stop() {
        System.out.println("Stopped....");
    }

    @Override
    public void record() {
        System.out.println("Recording in the progress....");
    }

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
            System.out.println("Choose the action: ");
            System.out.println("1 (play) / 2 (record) / 3 (pause) / 4 (stop) / 5 (exit)" );

        do {
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.record();
                    break;
                case 3:
                    player.pause();
                    break;
                case 4:
                    player.stop();
                    break;

            }
        } while (scanner.hasNextInt(5));
        System.out.println("...Finish...");
    }
}
