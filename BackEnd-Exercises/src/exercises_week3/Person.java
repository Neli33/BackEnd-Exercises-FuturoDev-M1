package exercises_week3;

public class Person {
    private String Name;
    private String Address;

    public Person(String _Name, String _Address) {
        this.Name = _Name;
        this.Address = _Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + Name);
    }
}
