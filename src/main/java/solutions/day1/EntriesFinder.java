package solutions.day1;

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
                    return firstEntry + " " + secondEntry;
                }
            }
        }
        return "No such entries";
    }
}
