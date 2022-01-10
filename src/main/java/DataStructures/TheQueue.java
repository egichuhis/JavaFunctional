package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

//FIFO (First In First Out
//A collection designed for holding elements prior to processing
public class TheQueue {
    public static void main(String[] args) {
LinkedList<Person> linkedList = new LinkedList<>();
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Alex", 23));
        supermarket.add(new Person("Ben", 24));
        supermarket.add(new Person("Charlie", 25));
        supermarket.add(new Person("David", 26));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
