import java.util.ArrayList;

class MiddleClass extends Person {

    private char fullName;

    private char occupation;

    private Integer netWorth;

    private char employedBy;

    public MiddleClass(char fullName, char occupation, Integer netWorth, char employedBy) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.netWorth = netWorth;
        this.employedBy = employedBy;
    }

    public boolean isImportant() {
        return false;
    }

    @Override
    public char getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return (T) this.netWorth;
    }
}