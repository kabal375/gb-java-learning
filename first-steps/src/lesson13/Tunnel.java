package lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    Semaphore throughput;
    public Tunnel(int length, Semaphore throughput) {
        this.length = length;
        this.description = "Тоннель " + length + " метров";
        this.throughput = throughput;
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                throughput.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                throughput.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

