package exercises_week1;

import java.util.Scanner;

public class Ex4 {
    // Exercise 4
    /* Develop a program where the user will enter the Customer's name. After that, a menu will open with the
     * options of the product to be sold: [1] Wristwatch [2] Silver Bracelet. After choosing the product,
     * it will be the turn of the discount menu: [1] 10% [2] 15% [3] 30%. At the end of the discount selection,
     * the program will display a message informing the Customer's name and the amount to be paid. Perform
     * validations for the values allowed in the menu.*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        {
            int productOption;
            String name = "";
            String[] product = {"Wristwatch", "Silver Bracelet"};
            double[] value = {100.00, 150.00};
            double[] discount = {0.10, 0.15, 0.30};

            do {
                System.out.print("Enter the Customer's name: ");
                name = ler.nextLine();
            } while (name.isBlank());

            System.out.println("Enter the Product:\n[1] Wristwatch\n[2] Silver Bracelet");
            System.out.print("Enter your option: ");
            productOption = ler.nextInt();

            System.out.println("Enter the discount:\n[1] 10%\n[2] 15%\n[3] 30%");
            System.out.print("Enter your option: ");
            int discountOption = ler.nextInt();

            double totalValue = value[productOption - 1];
            double selectedDiscount = discount[discountOption - 1];

            double discountedValue = totalValue - (totalValue * selectedDiscount);

            System.out.print(name + " bought a " + product[productOption - 1] + " priced at $" + totalValue +
                    " with a discount, the total amount to be paid is $" + discountedValue);
        }
    }
}