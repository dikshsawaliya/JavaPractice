import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class diningphilospher {

    Philosopher[] philosophers;
    Fork[] forks;
    Thread[] threads;

    Scanner scan;
    int number;
    public static void main (String[] args)
    {
        diningphilospher obj = new diningphilospher();
        obj.init();
        obj.startThinkingEating();
    }

    public void init()
    {

    }

    public void startThinkingEating()
    {

    }
    public class Fork
    {
        private int forkId;
        private boolean status;

        Fork(int forkId)
        {
            this.forkId = forkId;
            this.status = true;
        }

        public synchronized void free() throws InterruptedException
        {
            status = true;
        }

        public synchronized void pick(int philospherId) throws InterruptedException
        {
            int counter = 0;
            int waitUntil = new Random().nextInt(10) + 5;

            while (!status)
            {
                Thread.sleep(new Random().nextInt(100)+ 50);

                counter++;
            }
        }
    }
    public class Philosopher
    {

    }


}