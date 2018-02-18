package task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public final class UtilsWrite {

    private UtilsWrite() {
    }


    public static void write(Path newPath, Map<Character, Long> repeatLiters) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(newPath.toFile()))) {

            repeatLiters.entrySet().stream()
                    .forEach(it -> {
                        try {
                            wr.write(it.getKey() + "-" + it.getValue() + "\n");

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}