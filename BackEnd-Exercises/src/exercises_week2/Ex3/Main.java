package exercises_week2.Ex3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vania", "Petkova", "Attendant", 1760.00);
        Employee employee2 = new Employee("João", "Silva", "Driver", 2500.00);
        Employee employee3 = new Employee("Maria", "Pereira", "Assistant", 1600.00);

        System.out.println("Employee information: " + employee1.getFirstName() + " " + employee1.getLastName() + ", " + employee1.getPosition() + ".");
        System.out.println("Employee information: " + employee2.getFirstName() + " " + employee2.getLastName() + ", " + employee2.getPosition() + ".");
        System.out.println("Employee information: " + employee3.getFirstName() + " " + employee3.getLastName() + ", " + employee3.getPosition() + ".");
    }
}
