import java.util.ArrayList;

//interface inputClass {
//    char fullName = 0;
//
//    char occupation = 0;
//
//    long netWorth = 0;
//
//    ArrayList<Character> ownedCompany = new ArrayList<>();
//}

class PersonFactory {
    public static <T> T create(String fullName, String occupation, long netWorth, ArrayList<String> ownedCompany, String employedBy) {
        if (netWorth > 1000000) {
            return (T) new UpperClass(fullName, netWorth, ownedCompany);
        }
        if (netWorth > 100000) {
            return (T) new MiddleClass(fullName, occupation, netWorth, employedBy);
        }
        return (T) new LowClass(fullName);
    }
}