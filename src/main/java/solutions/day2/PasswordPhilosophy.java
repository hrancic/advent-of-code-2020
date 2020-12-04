package solutions.day2;

import solutions.utilities.InputReader;

import java.util.List;

public class PasswordPhilosophy {

    public static void main(String[] args) {
        InputReader passwordReader = new InputReader("src/main/resources/input/day2.txt");
        List<String> passwordDescriptions = passwordReader.readAsStrings();
        List<Password> passwords = PasswordUtils.convertToPasswords(passwordDescriptions);
        int count = PasswordUtils.countValid(passwords);

        System.out.println(count);
    }
}
