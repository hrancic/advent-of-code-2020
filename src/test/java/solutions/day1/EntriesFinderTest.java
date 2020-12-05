package solutions.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntriesFinderTest {

    private final EntriesFinder entriesFinder = givenEntriesFinder();

    @Test
    void shouldFindProductOfPairThatSumsTo2020() {
        int result = entriesFinder.findProductOfPairThatSumsTo(2020);
        assertEquals(514579, result);
    }

    @Test
    void shouldFindProductOfTripleThatSumsTo2020() {
        int result = entriesFinder.findProductOfTripleThatSumsTo2020();
        assertEquals(241861950, result);
    }

    private EntriesFinder givenEntriesFinder() {
        List<Integer> expenseReport = Arrays.asList(
                1721,
                979,
                366,
                299,
                675,
                1456
        );
        return new EntriesFinder(expenseReport);
    }
}