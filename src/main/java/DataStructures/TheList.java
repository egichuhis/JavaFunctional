package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        List <String> names = List.of(
                "Edwin",
                "Peter",
                "John",
                "Luther"
        );

//        names.add("Felix");

        System.out.println(names);


        List <String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("green"));

        for (String color: colors){
            System.out.println(color);
        }
    }
}
