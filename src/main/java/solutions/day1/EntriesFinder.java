package solutions.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntriesFinder {
    private final List<Integer> expenseReport;

    EntriesFinder(List<Integer> expenseReport) {
        this.expenseReport = expenseReport;
    }

    Integer findProductOfPairThatSumsTo(int targetSum) {
        Map<Integer, Integer> remainderToEntry = new HashMap<>();
        for (Integer entry : expenseReport) {
            remainderToEntry.put(targetSum - entry, entry);
        }
        for (Integer entry : expenseReport) {
            if (remainderToEntry.containsKey(entry)) {
                return entry * (targetSum - entry);
            }
        }
        return null;
    }

    Integer findProductOfTripleThatSumsTo2020() {
        for (Integer entry : expenseReport) {
            Integer result = findProductOfPairThatSumsTo(2020 - entry);
            if (result != null) {
                return entry * result;
            }
        }
        return null;
    }
}
