package toilet;

import static toilet.ShowerHoseType.CLASSIC;

public class ShowerCubicle extends Cubicle{
    private ShowerHose showerHose;

    public ShowerCubicle(ShowerHose showerHose) {
        this.showerHose = showerHose;
    }

    public ShowerCubicle() {
        this.showerHose = new ShowerHose(CLASSIC, "ARMIT");
    }

    public void changeShowerHose(ShowerHose newShowerHose) {
        this.showerHose = newShowerHose;
    }
}
