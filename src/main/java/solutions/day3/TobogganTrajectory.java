package solutions.day3;

import solutions.utilities.InputReader;

import java.util.Arrays;
import java.util.List;

public class TobogganTrajectory {

    public static void main(String[] args) {
        InputReader forrestReader = new InputReader("src/main/resources/input/day3.txt");
        List<String> forrest = forrestReader.readAsStrings();
        Traveler traveler = new Traveler(forrest, null);

        List<Slope> slopes = Arrays.asList(
                new Slope(3, 1),
                new Slope(1, 1),
                new Slope(5, 1),
                new Slope(7, 1),
                new Slope(1, 2)
        );

        for (Slope slope : slopes) {
            Toboggan toboggan = new Toboggan(slope);
            traveler.setToboggan(toboggan);
            traveler.travel();
        }

        System.out.println("Bumped to trees much? " + traveler.reportBumps());
    }
}
