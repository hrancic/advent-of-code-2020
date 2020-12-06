package solutions.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatIdentifierTest {

    @Test
    void shouldDetermineSeatId() {
        assertEquals(567, SeatIdentifier.getSeatId("BFFFBBFRRR"));
        assertEquals(119, SeatIdentifier.getSeatId("FFFBBBFRRR"));
        assertEquals(820, SeatIdentifier.getSeatId("BBFFBBFRLL"));
    }
}