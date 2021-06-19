package thread;

import common.exceptions.InvalidTimeException;
import model.Timer;

public class TimerThread extends Thread {
    private Timer timer;

    public TimerThread(int minutes, int seconds) {
        this.timer = new Timer(minutes, seconds);
    }

    @Override
    public void run() throws InvalidTimeException {
        Timer t = new Timer(timer.getMinutes(), timer.getSeconds());
        int sum = timer.getMinutes() * 60 + timer.getSeconds();
        for (int i = 0; i < sum + 1; i++) {
            if (i == 0)
                System.out.println(t.toString());
            else
                System.out.println(t.decreaseOneSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
