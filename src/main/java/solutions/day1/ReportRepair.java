package solutions.day1;

import java.util.List;

public class ReportRepair {

    public static void main(String[] args) {
        ReportReader reportReader = new ReportReader("src/main/resources/input/day1.txt");
        List<Integer> report = reportReader.read();
        EntriesFinder entriesFinder = new EntriesFinder(report);

        int productPair = entriesFinder.findProductOfPairThatSumsTo( 2020);
        int productTriple = entriesFinder.findProductOfTripleThatSumsTo(2020);

        System.out.println("Product of pair is: " + productPair);
        System.out.println("Product of triple is: " + productTriple);
    }
}
