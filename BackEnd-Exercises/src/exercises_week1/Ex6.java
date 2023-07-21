package exercises_week1;

import java.util.Scanner;

public class Ex6 {
        //Exercice 6
        /* Develop a Secret Santa System for a group of 6 friends, where after drawing a name, it must be made available
         * for all others to be drawn. We will use an array to store the names of the participants in the draw, and a loop
         * will be used for everyone to draw a Secret Santa!  */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int opcao;
        String[] pessoas = {"Simona", "Luana", "Sofia", "Zoe", "Miguel", "Felipe"};

        System.out.print("Enter a number from 1 to 6 to choose your Secret Santa: ");
        opcao = ler.nextInt();

        if (opcao <= 0 || opcao >= 7) {
            System.out.println("Invalid number!");
        } else {
            System.out.println("Your Secret Santa is: " + pessoas[opcao - 1]);
        }
    }
}

