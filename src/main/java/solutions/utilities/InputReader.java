package solutions.utilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class InputReader {

    private final String path;

    public InputReader(String path) {
        this.path = path;
    }

    public List<Integer> readAsIntegers() {
        try {
            return Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8)
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from file", e);
        }
    }

    public List<String> readAsStrings() {
        try {
            return Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from file", e);
        }
    }
}
