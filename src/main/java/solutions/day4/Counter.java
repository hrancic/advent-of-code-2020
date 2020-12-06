package solutions.day4;

import java.util.List;

public class Counter {

    private Counter() {
        throw new IllegalStateException("Utility class");
    }

    static long basic(List<String> passports) {
        return passports.stream()
                .filter(p -> p.contains("ecl"))
                .filter(p -> p.contains("hgt"))
                .filter(p -> p.contains("hcl"))
                .filter(p -> p.contains("pid"))
                .filter(p -> p.contains("iyr"))
                .filter(p -> p.contains("byr"))
                .filter(p -> p.contains("eyr"))
                .count();
    }
    //TODO: this doesn't produce valid result :-(
    static long advanced(List<String> passports) {
        return passports.stream()
                .filter(p -> p.matches(".*byr:(19[2-9]\\d|200[0-2]).*"))
                .filter(p -> p.matches(".*iyr:20(1\\d|20).*"))
                .filter(p -> p.matches(".*eyr:20(2\\d|30).*"))
                .filter(p -> p.matches(".*hgt:(1([5-8]\\d|9[0-3])cm|(59|6\\d|7[0-6])in).*"))
                .filter(p -> p.matches(".*hcl:#[0-9a-f]{6}.*"))
                .filter(p -> p.matches(".*ecl:(amb|blu|brn|gry|grn|hzl|oth).*"))
                .filter(p -> p.matches(".*pid:\\d{9}.*"))
                .count();
    }
}
