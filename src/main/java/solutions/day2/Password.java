package solutions.day2;

public class Password {
    private final int min;
    private final int max;
    private final char letter;
    private final String password;

    public Password(int min, int max, char letter, String password) {
        this.min = min;
        this.max = max;
        this.letter = letter;
        this.password = password;
    }

    boolean isValid() {
        int count = countOccurrence(letter, password);
        return count >= min && count <= max;
    }

    private int countOccurrence(char letter, String password) {
        int count = 0;
        char[] passwordLetters = password.toCharArray();
        for (char passwordLetter : passwordLetters) {
            if (letter == passwordLetter) {
                count++;
            }
        }
        return count;
    }
}
