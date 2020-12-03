package solutions.day2;

import solutions.utilities.InputReader;

import java.util.List;

public class PasswordPhilosophy {

    public static void main(String[] args) {
        InputReader passwordReader = new InputReader("src/main/resources/input/day2.txt");
        List<String> passwordDescriptions = passwordReader.readAsStrings();
        List<Password> passwords = PasswordParser.convertToPasswords(passwordDescriptions);

        int validPasswordsCount = 0;
        for (Password password : passwords) {
            if (password.isValid()) {
                validPasswordsCount++;
            }
        }

        System.out.println(validPasswordsCount);
    }
}
