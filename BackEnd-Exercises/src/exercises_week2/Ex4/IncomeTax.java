package exercises_week2.Ex4;

public class IncomeTax {
    //Exercise 4
    /* Method Overloading
    The concept of method overloading allows the code to be flexible, enabling the object to be
    instantiated in 2 or more ways. Create 3 methods using method overloading based on an IncomeTax class
    that performs the following calculations:

    1. Method to calculate income tax for those with an income between R$6,677.56 and R$9,922.28.
    2. Method to calculate income tax for those with an income between R$9,922.29 and R$13,167.00.
    3. Method to calculate income tax for those with an income between R$13,167.01 and R$16,380.38.  */


    private double income, income2, income3;
    private float taxRate1, taxRate2, taxRate3;
    private double tax;
    private int installment;

    // Constructor to initialize the income tax data
    public IncomeTax() {
        this.income = income;
        this.income2 = income2;
        this.income3 = income3;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.taxRate3 = taxRate3;
    }

    // Method for calculating income tax for income between R$6,677.56 to R$9,922.28
    public double calculateIncomeTax(double income) {
        if (income >= 6677.56 && income <= 9922.28) {
            return income * 0.15;
        } else if (income >= 9922.29 && income <= 13167.00) {
            return income * 0.20;
        } else if (income >= 13167.01 && income <= 16380.38) {
            return income * 0.25;
        } else {
            return 0; // No tax for income outside the specified ranges
        }
    }

    public double calculateIncomeTax(double income1, double income2, float taxRate2) {
        return (income1 + income2) * (taxRate2 / 100);
    }

    public double calculateIncomeTax(double income1, double income2, double income3, float taxRate3, int installment) {
        return ((income1 + income2 + income3) * (taxRate3 / 100)) - (installment * 189.59);
    }
}
