import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> johnSmithCompany = new ArrayList<String>();
        johnSmithCompany.add("apple inc.");
        johnSmithCompany.add("google llc.");
        johnSmithCompany.add("microsoft inc.");

        UpperClass aUpperClass = PersonFactory.create("John Smith", "", 1000001, johnSmithCompany, null);
        MiddleClass aMiddleClass = PersonFactory.create("Kumar Muhammad", "Plumber", 200000, null, "microsoft inc.");
        LowClass aLowClass = PersonFactory.create("Thant Myint", null, 0, null, null);

        System.out.println(aUpperClass.getInformation() + aUpperClass.isImportant() + aUpperClass.getNetWorth());
        System.out.println(aMiddleClass.getInformation() + aMiddleClass.isImportant() + aMiddleClass.getNetWorth());
        System.out.println(aLowClass.getInformation() + aLowClass.getNetWorth());
    }
}
