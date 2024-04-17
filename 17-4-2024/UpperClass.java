class UpperClass extends Person {

    private char fullName;

    private char occupation;

    private long netWorth;

    public UpperClass(char fullName, char occupation, long netWorth, ArrayList<char> ownedCompany) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.netWorth = netWorth;
        this.ownedCompany = ownedCompany;
    }

    public boolean isImportant() {
        return true;
    }

    public <void, K> void getInformation(K entity) {
        return this.fullName;
    }

    public char getNetWorth() {
        return 'confidential';
    }
}