package DataStructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);

        int [] numbers = {12, 13, 14, 15, 16};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        for (int number: numbers ) {
            System.out.println(number);
        }
        Arrays.stream(colors).forEach(System.out::println);
    }
}
