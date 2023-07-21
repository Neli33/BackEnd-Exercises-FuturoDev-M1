package exercises_week3;

public class PhysicalPerson extends Person{
    private String CPF;

    public PhysicalPerson(String _Name, String _Address, String _CPF) {
        super(_Name, _Address);
        this.CPF = _CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CPF: " + CPF);
    }
}
