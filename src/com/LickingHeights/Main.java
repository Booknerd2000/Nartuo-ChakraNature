package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int cpuPoints, user, cpu, userPoints, restart;

        boolean game,loop;
        game = true;
        loop=true;

        cpuPoints = 0;
        userPoints = 0;
        String cpuChakra, userChakra;


        String[] chakra = new String[5];
        chakra[0] = "fire";
        chakra[1] = "wind";
        chakra[2] = "lightning";
        chakra[3] = "earth";
        chakra[4] = "water";


        System.out.println("Pick a Chakra Nature");
        System.out.println("Fire = 0 \nWind = 1 \nLightning = 2\nEarth = 3\nWater = 4\n");
        while (loop) {

            while (game) {

                cpu = (int) (Math.random() * 5);
                cpuChakra = chakra[cpu];
                System.out.println(cpuChakra);

                user = keyboard.nextInt();
                userChakra = chakra[user];
                System.out.println(userChakra);

                switch (cpuChakra) {

                    case "fire":
                        if (userChakra == "wind" || userChakra == "lightning") {
                            cpuPoints++;
                        } else if (userChakra == cpuChakra) {
                            System.out.println("tie");
                        } else {
                            userPoints++;
                        }
                        break;

                    case "wind":
                        if (userChakra == "lightning" || userChakra == "earth") {
                            cpuPoints++;
                        } else if (userChakra == cpuChakra) {
                            System.out.println("tie");
                        } else {
                            userPoints++;
                        }
                        break;

                    case "lightning":
                        if (userChakra == "earth" || userChakra == "water") {
                            cpuPoints++;
                        } else if (userChakra == cpuChakra) {
                            System.out.println("tie");
                        } else {
                            userPoints++;
                        }
                        break;

                    case "earth":
                        if (userChakra == "water" || userChakra == "fire") {
                            cpuPoints++;
                        } else if (userChakra == cpuChakra) {
                            System.out.println("tie");
                        } else {
                            userPoints++;
                        }
                        break;

                    case "water":
                        if (userChakra == "fire" || userChakra == "wind") {
                            cpuPoints++;
                        } else if (userChakra == cpuChakra) {
                            System.out.println("tie");
                        } else {
                            userPoints++;
                        }
                        break;
                }
                System.out.println("cpu points" + cpuPoints + "my points" + userPoints);
                if (userPoints == 5 || cpuPoints == 5) {
                    game= false;
                    }
                }
                System.out.println("Do you want to play again\n[yes=1] [no=2]");
            restart =keyboard.nextInt();
            System.out.println(restart);

            if (restart == 1){
                userPoints =0;
                cpuPoints=0;
                game = true;
            }else if (restart == 2){
                loop=false;
            }
                }

            }

    }



