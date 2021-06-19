import common.exceptions.InvalidTimeException;
import thread.TimerThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input minutes and seconds");

        Scanner scanner1 = new Scanner(System.in);
        int minutes = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int seconds = scanner2.nextInt();

        TimerThread timerThread = new TimerThread(minutes, seconds);
        try {
            timerThread.start();
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
    }
}