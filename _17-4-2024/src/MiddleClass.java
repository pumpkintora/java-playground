import java.util.ArrayList;

class MiddleClass extends Person {

    private String fullName;

    private String occupation;

    private Integer netWorth;

    private String employedBy;

    public MiddleClass(String fullName, String occupation, long netWorth, String employedBy) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.netWorth = Math.toIntExact(netWorth);
        this.employedBy = employedBy;
    }

    public boolean isImportant() {
        return false;
    }

    @Override
    public String getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return (T) this.netWorth;
    }
}