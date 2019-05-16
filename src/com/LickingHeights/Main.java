package com.LickingHeights;
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

        while(true) {
            while (true) {

                cpu =(int)(Math.random()*5);
                cpuChakra = chakra[cpu];
                System.out.println(cpuChakra);

                user = keyboard.nextInt();
                userChakra = chakra[user];
                System.out.println(userChakra);

                switch (cpu) {
                    case 0:
                        if (userChakra == "wind" || userChakra == "lightning") {
                            cpuPoints++;
                        }
                        break;
                    case 1:
                        if (userChakra == "lightning" || userChakra == "earth") {
                            cpuPoints++;

                        }
                    case 2:

                        if (userChakra == "earth" || userChakra == "water") {
                            cpuPoints++;

                        }
                        break;
                    case 3:

                        if (userChakra == "water" || userChakra == "fire") {
                            cpuPoints++;

                        }
                        break;
                    case 4:
                        if (userChakra == "fire" || userChakra == "wind") {
                            cpuPoints++;
                        }
                        break;

                }
                System.out.println("cpu points"+cpuPoints+"my points"+userPoints);
            }
        }

    }

}
