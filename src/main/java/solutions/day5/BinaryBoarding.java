package solutions.day5;

import solutions.utilities.InputReader;

import java.util.List;

public class BinaryBoarding {

    public static void main(String[] args) {
        InputReader boardingPassReader = new InputReader("src/main/resources/input/day5.txt");
        List<String> boardingPasses = boardingPassReader.readAsStrings();

        int maxSeatId = 0;
        for (String pass : boardingPasses) {
            int seatId = SeatIdentifier.getSeatId(pass);
            if (seatId > maxSeatId) {
                maxSeatId = seatId;
            }
        }

        System.out.println(maxSeatId);
        System.out.println(SeatIdentifier.getMissingId(boardingPasses));
    }
}
