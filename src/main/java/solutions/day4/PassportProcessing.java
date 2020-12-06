package solutions.day4;

import solutions.utilities.InputReader;

import java.util.List;

public class PassportProcessing {

    public static void main(String[] args) {
        InputReader reader = new InputReader("src/main/resources/input/day4.txt");
        List<String> passports = reader.readAsStringsSeparatedByBlankLine();

        System.out.println(Counter.basic(passports));
        System.out.println(Counter.advanced(passports));
    }
}
