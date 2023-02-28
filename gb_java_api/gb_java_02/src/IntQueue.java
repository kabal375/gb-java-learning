/*
Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
*/

import java.util.Collection;
import java.util.LinkedList;

public class IntQueue {
    private LinkedList<Integer> queue;


    public IntQueue() {
        this.queue = new LinkedList<>();
    }

    public IntQueue(Collection<Integer> collection) {
        this.queue = new LinkedList<>();
        for (Integer item:
             collection) {
            this.queue.addLast(item);
        }

    }

    void enqueue(int item) {
        queue.addLast(item);
    }

    Integer dequeue() {
        return queue.pollFirst();
    }

    Integer first() {
        return queue.peekFirst();
    }

    void reverse() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//                Постараться не обращаться к листу по индексам.
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int item:
             queue) {
            list2.addFirst(item);
        }
        queue = list2;
    }

    int sum() {
//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        int sum = 0;
        for (int item:
             queue) {
            sum += item;
        }
        return sum;
    }

}
