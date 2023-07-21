package exercises_week2.Ex4;

public class Main {
    public static void main(String[] args) {
             IncomeTax incomeTaxCalculator = new IncomeTax();

            double tax1 = incomeTaxCalculator.calculateIncomeTax(10598);
            double tax2 = incomeTaxCalculator.calculateIncomeTax(10598.76, 27650, 27.50f);
            double tax3 = incomeTaxCalculator.calculateIncomeTax(14876.69, 27950, 2993.92, 27.50f, 1);

            System.out.println("Income Tax 1: " + tax1);
            System.out.println("Income Tax 2: " + tax2);
            System.out.println("Income Tax 3: " + tax3);
    }
}

