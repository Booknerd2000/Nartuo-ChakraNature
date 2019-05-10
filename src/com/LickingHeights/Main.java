package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        String shinobi;

        number =(int)(Math.random()*5);

        System.out.println(number);

        String [] chakra = new String[5];
            chakra[0] = "fire";
            chakra[1] = "wind";
            chakra[2] = "lightning";
            chakra[3] = "earth";
            chakra[4] = "water";

        System.out.println( chakra[number]);

        shinobi= keyboard.nextLine();


    }

}
