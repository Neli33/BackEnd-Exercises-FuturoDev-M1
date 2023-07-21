package exercises_week1;

import java.util.Scanner;

public class Ex3 {

    // Exercise 3
    /* In the following situation, a salesperson sold 5 wristwatches at a price of $350 each and two bracelets at
     * a price of $700 each. The salesperson agreed with the customer that if the customer purchased more than
     * $2000, they would receive a 20% discount, and if they purchased more than $3000, they would receive a 25%
     * discount. Print the final amount that the salesperson will charge the customer.*/

    public  static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        int numWristwatchess = 5;
        double wristwatchPrice = 350.0;
        int numBracelets = 2;
        double barceletsPrice = 700.0;

        double totalSaleValue = (numWristwatchess * wristwatchPrice) + (numBracelets * barceletsPrice);

        double discount = 0.0;
        if(totalSaleValue > 3000.0){
            discount = totalSaleValue * 0.25;
        }else if (totalSaleValue > 2000.0){
            discount = totalSaleValue *0.20;
        }
        double finalAmount = totalSaleValue - discount;

        System.out.print("The final amount is " + finalAmount);
    }
}
