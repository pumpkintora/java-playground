package toilet;

import toilet.ShowerHoseType;
import toilet.ToiletBowlType;

import java.util.ArrayList;
import java.util.Arrays;

public class TestToilet {

    public static void main(String[] args) {
        ShowerCubicle showerCubicleOne = new ShowerCubicle();
        ToiletBowlCubicle toiletBowlCubicleOne = new ToiletBowlCubicle();

        ShowerHose showerHoseOne = new ShowerHose(ShowerHoseType.ANTI_TWIST, "TIM");
        ToiletBowl toiletBowlOne = new ToiletBowl(ToiletBowlType.INTELLIGENT, "TIM");

        ShowerCubicle showerCubicleTwo = new ShowerCubicle(showerHoseOne);
        ToiletBowlCubicle toiletBowlCubicleTwo = new ToiletBowlCubicle(toiletBowlOne);

        Toilet toilet = new Toilet(new ArrayList<>(Arrays.asList(showerCubicleOne, showerCubicleTwo, toiletBowlCubicleOne, toiletBowlCubicleTwo)));
    }
}
