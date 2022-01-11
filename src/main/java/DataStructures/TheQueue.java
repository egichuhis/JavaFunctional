package DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

//FIFO (First In First Out
//A collection designed for holding elements prior to processing
public class TheQueue {
    public static void main(String[] args) {
LinkedList<Person> linkedList = new LinkedList<>();

linkedList.add(new Person("Alex", 23));
linkedList.add(new Person("Ben", 24));
linkedList.add(new Person("Charlie", 25));
linkedList.addFirst(new Person("Edwin", 29));

ListIterator<Person> personListIterator = linkedList.listIterator();
while (personListIterator.hasNext()){
    System.out.println(personListIterator.next());
}
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();

//        supermarket.add(new Person("Alex", 23));
//        supermarket.add(new Person("Ben", 24));
//        supermarket.add(new Person("Charlie", 25));
//        supermarket.add(new Person("David", 26));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
