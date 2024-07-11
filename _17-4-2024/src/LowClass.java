public class LowClass extends Person{

    private String fullName;

    public LowClass(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean isImportant() {
        return false;
    }

    @Override
    public String getInformation() {
        return this.fullName;
    }

    @Override
    public <T> T getNetWorth() {
        return null;
    }
}
