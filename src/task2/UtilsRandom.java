package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class UtilsRandom {

    public UtilsRandom() {
    }

    public static List<String> getRundomNumbers() {
        Random random = new Random();
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(String.valueOf(random.nextInt(100)));
        }

        return numbers;
    }

    public static void sotrContentFile(Path path) {
        List<String> list = null;

        try {
            list = Files.lines(path)
                    .map(Integer::valueOf)
                    .sorted(Integer::compareTo)
                    .map(String::valueOf)
                    .collect(Collectors.toList());

            Files.write(path, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
