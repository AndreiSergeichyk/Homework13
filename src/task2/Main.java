package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources", "task2", "rundomNumbers.txt");

        Files.write(path, UtilsRandom.getRundomNumbers());
        UtilsRandom.sotrContentFile(path);
    }
}
