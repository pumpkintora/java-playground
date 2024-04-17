public class LowClass extends Person{

    private char fullName;

    public LowClass(char fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean isImportant() {
        return false;
    }

    @Override
    public char getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return null;
    }
}
