import java.util.ArrayList;

abstract class Person {
    private String fullName;
    private String occupation;
    private long netWorth;
    private ArrayList<Character> ownedCompany;
    private String employedBy;
    abstract public boolean isImportant();
    abstract public String getInformation();
//    if net-worth < 100000, return actual net worth, else return "confidential"
    abstract public <T> T getNetWorth();
}