package solutions.day1;

import solutions.utilities.InputReader;

import java.util.List;

public class ReportRepair {

    public static void main(String[] args) {
        InputReader reportReader = new InputReader("src/main/resources/input/day1.txt");
        List<Integer> report = reportReader.readAsIntegers();
        EntriesFinder entriesFinder = new EntriesFinder(report);

        int productPair = entriesFinder.findProductOfPairThatSumsTo(2020);
        int productTriple = entriesFinder.findProductOfTripleThatSumsTo2020();

        System.out.println("Product of pair is: " + productPair);
        System.out.println("Product of triple is: " + productTriple);
    }
}
