package solutions.day3;

import java.util.Iterator;
import java.util.List;

public class Traveler {
    private final List<String> forrest;
    private Toboggan toboggan;
    private int bumpProduct;

    public Traveler(List<String> forrest, Toboggan toboggan) {
        this.forrest = forrest;
        this.toboggan = toboggan;
        this.bumpProduct = 1;
    }

    void travel() {
        Iterator<String> road = forrest.iterator();
        int boundary = road.next().length();

        while (road.hasNext()) {
            String row = toboggan.moveDown(road);
            toboggan.moveRight(boundary);
            toboggan.checkForBump(row);
        }
        bumpProduct = bumpProduct * toboggan.getBumps();
    }

    void reportBumps() {
        System.out.println(bumpProduct);
    }

    void setToboggan(Toboggan toboggan) {
        this.toboggan = toboggan;
    }
}

