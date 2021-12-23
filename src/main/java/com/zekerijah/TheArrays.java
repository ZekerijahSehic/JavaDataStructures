package com.zekerijah;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];

        colors[0] = "black";
        colors[1] = "white";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "red";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        // looping trough array

        for (int i =0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // looping in reverse

        for(int i = colors.length -1; i>= 0; i--) {
            System.out.println(colors[i]);
        }

        // enhanced for loop

        for (String color : colors) {
            System.out.println(color);
        }

        // stream

        Arrays.stream(colors).forEach(System.out::println);

    }
}
