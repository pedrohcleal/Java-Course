import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritereBufferedWriter {
    public static void main(String[] args) {
        Path caminhoAtual = Paths.get("").toAbsolutePath();
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = String.valueOf(caminhoAtual);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}