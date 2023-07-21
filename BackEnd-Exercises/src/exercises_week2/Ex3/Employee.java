package exercises_week2.Ex3;

public class Employee {
    //Exercise 3
    /*Through the constructor method, it is possible to create the object in memory. Based on this,
    define a class called Employee with at least 2 attributes and create the default constructor method for this class.*/
    private String firstName;
    private String lastName;
    private String position;
    private Double salary;

    public Employee() {
    }
    public Employee(String firstName, String lastName, String position, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}