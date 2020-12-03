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

    int[] read() {
        try {
            List<Integer> entries = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8)
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            return convertToArray(entries);
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from file", e);
        }
    }

    private int[] convertToArray(List<Integer> entries) {
        int[] result = new int[entries.size()];
        int index = 0;
        for(Integer entry: entries) {
            result[index++] = entry;
        }
        return result;
    }
}
