package solutions.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeatIdentifier {

    private SeatIdentifier() {
        throw new IllegalStateException("Utility class");
    }

    static int getSeatId(String boardingPass) {
        char[] row = boardingPass.substring(0,7).toCharArray();
        char[] column = boardingPass.substring(7).toCharArray();
        return getRowNumber(row) * 8 + getColumnNumber(column);
    }

    static int getMissingId(List<String> boardingPasses) {
        List<Integer> seatIds = boardingPasses
                .stream()
                .map(SeatIdentifier::getSeatId)
                .collect(Collectors.toList());

        int[] ids = new int[seatIds.size()];
        int idx = 0;
        for (Integer id: seatIds) {
            ids[idx++] = id;
        }
        Arrays.sort(ids);
        int mySeatId = 0;
        for (int i = 0, j = 1; j < ids.length; i++, j++) {
            if (ids[j] - ids[i] == 2) {
                mySeatId =  ids[j] - 1;
                break;
            }
        }
        return mySeatId;
    }

    private static int getRowNumber(char[] row) {
        int start = 0;
        int stop = 128;
        int position = 0;

        for (char letter : row) {
            if (letter == 'F') {
                stop = (start + stop) / 2;
                position = start;
            }
            if (letter == 'B') {
                start = (start + stop) / 2;
                position = stop - 1;
            }
        }
        return position;
    }

    private static int getColumnNumber(char[] column) {
        int start = 0;
        int stop = 8;
        int position = 8;

        for (char letter: column) {
            if (letter == 'L') {
                stop = (start + stop) / 2;
                position = start;
            }
            if (letter == 'R') {
                start = (start + stop) / 2;
                position = stop - 1;
            }
        }
        return position;
    }
}
