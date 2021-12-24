package com.zekerijah;

// List is interface so we can not instantite it, we use ArrayList and LinkedList

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){

        List<String> colorsUnmodifiable = List.of(
                "green",
                "yellow"
        );

        // colorsUnmodifiable.add("purple");

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("red");

        System.out.println(colors.size());
        System.out.println(colors.contains("white"));
        System.out.println(colors.contains("orange"));
        System.out.println(colors);

        for(String color:colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

    }
}
