package DataStructures;


//maps --> a collection of key-value pairs
//HashTable-->Null not allowed
//HashMap-->Null allowed
//SortedMap

//key cannot be duplicate, and you can assign utmost one value to each

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Alex"));
        map.put(2, new Person("Arnold"));
        map.put(3, new Person("Mariam"));
//        map.put(1, new Person("Edwin"));
        map.remove(3);


        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(System.out::println);

    }

    record Person(String name){}
}
