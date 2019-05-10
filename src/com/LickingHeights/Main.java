package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        int number;
        number =(int)(Math.random()*5);

        System.out.println(number);

        String [] chakra = new String[5];
            chakra[0] = "fire";
            chakra[1] = "wind";
            chakra[2] = "lightning";
            chakra[3] = "earth";
            chakra[4] = "water";

        System.out.println( chakra[number]);

    }

}
