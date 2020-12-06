package solutions.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    // TODO: reimplement
    public List<String> readAsStringsSeparatedByBlankLine() {
        List<String> strings = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader((new FileReader(path)))) {
            String line = reader.readLine();
            String fullLine = "";
            do {
                if (line.isBlank()) {
                    strings.add(fullLine);
                    fullLine = "";
                }
                fullLine = fullLine + " " + line;
            } while ((line = reader.readLine()) != null);
            strings.add(fullLine);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("Could not find file", e);
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from file", e);
        }
        return strings;
    }
}
