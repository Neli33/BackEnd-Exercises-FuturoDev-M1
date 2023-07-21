package exercises_week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter data for Physical Person:");
        System.out.print("Name: ");
        String namePhysical = scanner.nextLine();
        System.out.print("Address: ");
        String addressPhysical = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        PhysicalPerson physicalPerson = new PhysicalPerson(namePhysical, addressPhysical, cpf);
        peopleList.add(physicalPerson);

        System.out.println("\nEnter data for Legal Person:");
        System.out.print("Name: ");
        String nameLegal = scanner.nextLine();
        System.out.print("Address: ");
        String addressLegal = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        LegalPerson legalPerson = new LegalPerson(nameLegal, addressLegal, cnpj);
        peopleList.add(legalPerson);


        System.out.println("\nPrinting all the information of the people:");
        for (Person person : peopleList) {
            person.displayInfo();
            System.out.println();
        }
    }
}
