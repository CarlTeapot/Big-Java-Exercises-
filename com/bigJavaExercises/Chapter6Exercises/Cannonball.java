package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class Cannonball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double initialv,
                startp = 0,
                endp = 0,
                exactp = 0,
                time = 0.01,
                gravity = 9.8,
                deltaT = 0.01;
        System.out.print("Please enter the initial velocity: ");
        initialv = in.nextDouble();

        for (time=0; initialv>=0; time++)
        {endp=startp+initialv*deltaT;
            initialv=initialv-(gravity*deltaT);
            exactp=-0.5*gravity*(time*time)+(initialv*time);

            System.out.print("The velocity of the cannonball is: "+initialv + " m/sec.");
            System.out.println("");
            System.out.print("\nThe new position of the cannonball is: " + endp + " m.");
            System.out.println("");
            System.out.print("\nThe exact position of the cannonball is: "+ exactp + " m.");
            System.out.println("");
        }
    }
}
