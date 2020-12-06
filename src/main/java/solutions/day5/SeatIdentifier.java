package solutions.day5;

public class SeatIdentifier {

    private SeatIdentifier() {
        throw new IllegalStateException("Utility class");
    }

    static int getSeatId(String boardingPass) {
        char[] row = boardingPass.substring(0,7).toCharArray();
        char[] column = boardingPass.substring(7).toCharArray();
        return getRowNumber(row) * 8 + getColumnNumber(column);
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
