package exercises_week1;

import java.util.Scanner;

public class Ex2 {
    // Exercise 2
    /* Create a program that variables distance and time will receive the values 100 and 5.
     * Knowing that the distance is measured in kilometers and time in hours, develop a code to
     * display the following message: "The car that was driving took 5 hours to cover 100km,
     * so it was driving at 20km/h!", use the variables to perform the calculation and display the result.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        {

            int distance = 100;
            int time = 5;
            System.out.println("The car that was drive took " + time + " hours to cover " + distance + "km, so it was driving at " + (distance / time ) + "km/h!");
        }
    }
}
