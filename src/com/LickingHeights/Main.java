package com.LickingHeights;
import sun.java2d.loops.DrawGlyphList;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int cpuPoints,user,cpu,userPoints;

        cpuPoints = 0;
        userPoints = 0;
        String cpuChakra,userChakra;




        String [] chakra = new String[5];
            chakra[0] = "fire";
            chakra[1] = "wind";
            chakra[2] = "lightning";
            chakra[3] = "earth";
            chakra[4] = "water";



        System.out.println("Pick a Chakra Nature");
        System.out.println("Fire = 0 \nWind = 1 \nLightning = 2\nEarth = 3\nWater = 4");
        while(true) {

            while (true) {

                cpu =(int)(Math.random()*5);
                cpuChakra = chakra[cpu];
                System.out.println(cpuChakra);

                user = keyboard.nextInt();
                userChakra = chakra[user];
                System.out.println(userChakra);

                switch (cpuChakra) {
                    case "fire":
                        if (userChakra == "wind" || userChakra == "lightning") {
                            cpuPoints++;
                        }
                        break;

                    case "wind":
                        if (userChakra == "lightning" || userChakra == "earth") {
                            cpuPoints++;
                        }

                    case "lightning":
                        if (userChakra == "earth" || userChakra == "water") {
                            cpuPoints++;
                        }
                        break;

                    case "earth":
                        if (userChakra == "water" || userChakra == "fire") {
                            cpuPoints++;
                        }
                        break;

                    case "water":
                        if (userChakra == "fire" || userChakra == "wind") {
                            cpuPoints++;
                        }
                        break;

                    case "tie":
                        if (cpuChakra == userChakra) {
                            System.out.println("Tie");
                        }
                        break;

                    case "user wins":
                        userPoints++;
                        break;
                }

                System.out.println("cpu points"+cpuPoints+"my points"+userPoints);

                if (userPoints==5 || cpuPoints==5){
                    break;
                }
            }
        }

    }

}
