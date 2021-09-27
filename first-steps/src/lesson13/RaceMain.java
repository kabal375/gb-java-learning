package lesson13;

/*
Все участники должны стартовать одновременно, несмотря на разное время подготовки.
В тоннель не может одновременно заехать больше половины участников (условность).

Первый участник, пересекший финишную черту, объявляется победителем (в момент пересечения этой самой черты).

Победитель должен быть только один (ситуация с 0 или 2+ победителями недопустима).

Когда все завершат гонку, нужно выдать объявление об окончании.
*/


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class RaceMain {

    public static final int CARS_COUNT = 6;

    public static CyclicBarrier participantsPreparing = new CyclicBarrier(CARS_COUNT + 1);
    public static Semaphore tunnelThroughput = new Semaphore(CARS_COUNT/2);
    public static CountDownLatch winRace = new CountDownLatch(1);

    public static void main(String[] args) {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(80, tunnelThroughput), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), participantsPreparing, winRace);
        }

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            new Thread(car).start();

        }

        try {
            participantsPreparing.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");



        try {
            winRace.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!! Победитель: " + Race.raceWinner);


    }
}