package priority_queue;

import java.util.Iterator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> collection = new java.util.PriorityQueue<>();

        // метод offer() вставляет элемент в очередь, если это не удалось - возвращает false.

        collection.offer("1");
        collection.offer("2");
        collection.offer("3");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(collection.poll());
        }

        // методы remove() и poll() удаляют верхушку очереди и возвращают ее.
        // Какой элемент будет удален (первый или последний) зависит от реализации очереди.
        // Методы remove() и poll() отличаются лишь поведением, когда очередь пустая:
        // метод remove() генерирует исключение, а метод poll() возвращает null.

        // методы element() и peek() возвращают (но не удаляют) верхушку очереди.

        System.out.println("num of element " + collection.size());
    }
}
