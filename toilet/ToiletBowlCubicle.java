package toilet;

import static toilet.ToiletBowlType.ONE_PIECE;

public class ToiletBowlCubicle {
    private ToiletBowl toiletBowl;

    public ToiletBowlCubicle(ToiletBowl toiletBowl) {
        this.toiletBowl = toiletBowl;
    }

    public ToiletBowlCubicle() {
        this.toiletBowl = new ToiletBowl(ONE_PIECE, "JOHNSON");
    }

    public void changeToiletBowl(ToiletBowl newToiletBowl) {
        this.toiletBowl = newToiletBowl;
    }
}
