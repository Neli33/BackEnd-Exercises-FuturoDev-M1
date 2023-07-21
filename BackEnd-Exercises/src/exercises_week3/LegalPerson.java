package exercises_week3;

public class LegalPerson extends Person {
    private String CNPJ;

    public LegalPerson(String _Name, String _Address, String _CNPJ) {
        super(_Name, _Address);
        this.CNPJ = _CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CNPJ: " + CNPJ);
    }
}
