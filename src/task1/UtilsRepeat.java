package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public final class UtilsRepeat {

    private UtilsRepeat() {
    }

    public static Map<Character, Long> getRepeatabilityMap(Path path) {
        Map<Character, Long> repeatabilityMap = null;

        try {
            repeatabilityMap = Files.lines(path)
                    .map(String::toUpperCase)
                    .flatMapToInt(it -> it.chars())
                    .filter(it -> it >= 'А' && it <= 'Я')
                    .mapToObj(it -> (Character.valueOf((char) it)))
                    .collect(Collectors.groupingBy(it -> it, Collectors.counting()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return repeatabilityMap;
    }
}
