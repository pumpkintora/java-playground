package toilet;

public class Cubicle {
    private boolean hasTissue;

    private boolean hasWaterHose;

    public void restockTissue() {
        this.hasTissue = true;
    }

    public void installWaterHose() {
        this.hasWaterHose = true;
    }

    public boolean getHasTissue() {
        return hasTissue;
    }
    public boolean getHasWaterHose() {
        return hasWaterHose;
    }
}
