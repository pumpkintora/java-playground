import java.util.ArrayList;

abstract class Person {

    private char fullName;

    private long netWorth;

    private ArrayList<Character> ownedCompany;

    private char employedBy;

    abstract public boolean isImportant();

    abstract public char getInformation();

//    if net-worth < 100000, return actual net worth, else return "confidential"
    abstract public <T> T getNetWorth();
}