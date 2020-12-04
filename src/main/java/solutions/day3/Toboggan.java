package solutions.day3;

import java.util.Iterator;

public class Toboggan {
    private final Slope slope;
    private int position;
    private int bumps;

    Toboggan(Slope slope) {
        this.slope = slope;
        this.position = 0;
        this.bumps = 0;
    }

    void moveRight(int boundary) {
        if ((position + slope.stepRight) < boundary) {
            this.position = position + slope.stepRight;
            return;
        }
        if ((position + slope.stepRight) > boundary) {
            this.position = (position + slope.stepRight) - boundary;
            return;
        }
        this.position = 0;
    }

    String moveDown(Iterator<String> road) {
        for (int i = 0; i < slope.stepDown - 1; i++) {
            road.next();
        }
        return road.next();
    }

    void checkForBump(String forrestRow) {
        if (forrestRow.charAt(position) == '#') {
            bumps++;
        }
    }

    int getBumps() {
        return bumps;
    }
}
