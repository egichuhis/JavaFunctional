package DataStructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//A collection that contains no duplicate elements, no pair of elements
//unordered elements
public class TheSet {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        System.out.println(balls.size());


        balls.forEach(System.out::println);
    }

    static class Ball {

        String color;

        public Ball(String color) {
            this.color = color;
        }

        }

        //record Ball(String color){

    }

