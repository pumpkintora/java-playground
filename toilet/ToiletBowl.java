package toilet;

import toilet.ToiletBowlType;

public class ToiletBowl {
    private final ToiletBowlType toiletBowlType;
    private final String brand;

    public ToiletBowl(ToiletBowlType toiletBowlType, String brand) {
        this.toiletBowlType = toiletBowlType;
        this.brand = brand;
    }

    public void getToiletBowl() {
        System.out.println("Toilet bowl type:" + this.toiletBowlType);
        System.out.println("Brand:" + this.brand);
    }
}