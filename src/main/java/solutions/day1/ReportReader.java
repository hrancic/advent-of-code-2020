package solutions.day1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReportReader {
    private final String path;

    public ReportReader(String path) {
        this.path = path;
    }

    List<Integer> read() {
        try {
            return Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8)
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from file", e);
        }
    }
}
