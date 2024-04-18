import java.util.ArrayList;

class UpperClass extends Person {

    private String fullName;
    private Integer netWorth;
    private ArrayList<String> ownedCompany;
    public UpperClass(String fullName, long netWorth, ArrayList<String> ownedCompany) {
        this.fullName = fullName;
        this.netWorth = Math.toIntExact(netWorth);
        this.ownedCompany = ownedCompany;
    }

    public boolean isImportant() {
        return true;
    }

    @Override
    public String getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return (T) "confidential";
    }
}