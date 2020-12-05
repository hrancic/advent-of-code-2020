package solutions.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilsTest {

    @Test
    void shouldCountValidPasswords() {
        List<Password> passwords = givenPasswords();
        int valid = PasswordUtils.countValid(passwords);
        assertEquals(1, valid);
    }

    private List<Password> givenPasswords() {
        List<String> passwordDescriptions = Arrays.asList(
                "1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc"
        );
        return PasswordUtils.convertToPasswords(passwordDescriptions);
    }
}