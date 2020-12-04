package solutions.day2;

public class Password {
    private final int min;
    private final int max;
    private final char letter;
    private final String phrase;

    public Password(int min, int max, char letter, String phrase) {
        this.min = min;
        this.max = max;
        this.letter = letter;
        this.phrase = phrase;
    }

    boolean isValid() {
        int count = countOccurrence(letter, phrase);
        return count >= min && count <= max;
    }

    boolean isValidRevised() {
        char[] passwordLetters = phrase.toCharArray();
        int first = passwordLetters[min - 1];
        int second = passwordLetters[max - 1];
        return (first == letter && second != letter) || (second == letter && first != letter);
    }

    private int countOccurrence(char letter, String phrase) {
        int count = 0;
        char[] passwordLetters = phrase.toCharArray();
        for (char passwordLetter : passwordLetters) {
            if (letter == passwordLetter) {
                count++;
            }
        }
        return count;
    }
}
