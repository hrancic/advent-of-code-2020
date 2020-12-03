package solutions.day1;

public class ReportRepair {

    public static void main(String[] args) {
        ReportReader reportReader = new ReportReader("src/main/resources/input/day1.txt");
        int[] report = reportReader.read();
        String result = EntriesFinder.find(report);
        System.out.println(result);
    }
}
