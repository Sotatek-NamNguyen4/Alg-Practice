import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DuplicateFileName {
    static void changeName() {
        String filePath = "";
        Path file = Paths.get(filePath);
        String name = file.getFileName().toString();
        int i = 1;
        String copiedName = name.replaceFirst("(\\.[^\\.]*)?$", "(" + i++ +")");
        Path copiedFile =  file.resolveSibling(copiedName);
        try {
            Files.copy(file, copiedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
