package toilet;

import toilet.ShowerHoseType;

public class ShowerHose {
    private final ShowerHoseType showerHoseType;
    private final String brand;

    public ShowerHose(ShowerHoseType showerHoseType, String brand) {
        this.showerHoseType = showerHoseType;
        this.brand = brand;
    }

    public void getShowerHose() {
        System.out.println("Shower hose type:" + this.showerHoseType);
        System.out.println("Brand:" + this.brand);
    }
}