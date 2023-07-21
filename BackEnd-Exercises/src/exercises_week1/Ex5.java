package exercises_week1;

import java.util.Scanner;

public class Ex5 {
    // Exercise 5
    /* Develop a program for the Fibonacci sequence, where the user will enter how many numbers of the
     * sequence they want to verify. After the input, the program should display the requested number of
     * Fibonacci sequence numbers.*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int num;
        int num0 = 0;
        int num1 = 1;
        System.out.print("Enter how many numbers of the Fibonacci sequence you want to verify: ");
        num = ler.nextInt();

        for (int x = 0; x < num; x++) {
            int nextNum = num0 + num1;
            num0 = num1;
            num1 = nextNum;
            System.out.println(num0);
        }
    }
}

