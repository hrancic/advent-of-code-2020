package solutions.day2;

import java.util.ArrayList;
import java.util.List;

public class PasswordUtils {

    private PasswordUtils() {
        throw new IllegalStateException("Should not instantiate utility class");
    }

    static int countValid(List<Password> passwords) {
        int valid = 0;
        for (Password password : passwords) {
            if (password.isValidRevised()) {
                valid++;
            }
        }
        return valid;
    }

    static List<Password> convertToPasswords(List<String> rows) {
        List<Password> passwords = new ArrayList<>();
        for(String row: rows) {
            passwords.add(convert(row));
        }
        return passwords;
    }

    private static Password convert(String row) {
        String[] parts = row.split(" ");
        int min = Integer.parseInt(parts[0].split("-")[0]);
        int max = Integer.parseInt(parts[0].split("-")[1]);
        char letter = parts[1].charAt(0);
        String password = parts[2];
        return new Password(min, max, letter, password);
    }
}
