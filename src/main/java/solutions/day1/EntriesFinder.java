package solutions.day1;

import java.util.HashMap;
import java.util.Map;

public class EntriesFinder {

    private EntriesFinder() {
        throw new IllegalStateException("Should not instantiate utility class");
    }

    static String find(int[] expenseReport) {
        for (int i = 0; i < expenseReport.length; i++) {
            int firstEntry = expenseReport[i];
            for (int j = i + 1; j < expenseReport.length; j++) {
                int secondEntry = expenseReport[j];
                if (firstEntry + secondEntry == 2020) {
                    return firstEntry + " * " + secondEntry + " = " + firstEntry * secondEntry;
                }
            }
        }
        return "No such entries";
    }

    static String findFaster(int[] expenseReport) {
        Map<Integer, Integer> remainderToEntry = new HashMap<>();
        for(int entry: expenseReport) {
            remainderToEntry.put(2020-entry, entry);
        }
        for (int entry: expenseReport) {
            if (remainderToEntry.containsKey(entry)) {
                return entry + " * " + (2020 - entry) + " = " + (entry * (2020 - entry));
            }
        }
        return "No such entries";
    }
}
