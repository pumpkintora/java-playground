import java.util.ArrayList;

class UpperClass extends Person {

    private char fullName;

    private char occupation;

    private Integer netWorth;

    private ArrayList<Character> ownedCompany;

    public UpperClass(char fullName, char occupation, Integer netWorth, ArrayList<Character> ownedCompany) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.netWorth = netWorth;
        this.ownedCompany = ownedCompany;
    }

    public boolean isImportant() {
        return true;
    }

    @Override
    public char getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return (T) "confidential";
    }
}