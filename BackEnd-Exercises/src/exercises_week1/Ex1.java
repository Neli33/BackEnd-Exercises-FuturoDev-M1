package exercises_week1;

import java.util.Scanner;

public class Ex1 {
    // Exercise 1
    /* Create a program that will receive the respective values 22, April, 1500, and Brazil
     * for the variables day, month, year, and country. The program should display the following message:
     * "Brazil was discovered on the 22nd of April, 1500!", using the values from the variables. */
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        {
            int day = 22;
            String month = " april";
            int year = 1500;
            String country = "Brazil";

            System.out.print( country + " was discovered on the " + day + "nd of" + month + ", " + year + "!");
        }
    }
}
