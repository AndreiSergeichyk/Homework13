package task1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources", "task1", "Pushkin.txt");
        Path newPath = Paths.get("resources", "task1", "newPushkin.txt");

        Map<Character, Long> liters = UtilsRepeat.getRepeatabilityMap(path);
        UtilsWrite.write(newPath, liters);
    }
}
