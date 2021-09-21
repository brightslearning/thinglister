import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    private String directory;

    public FileParser(String directory) {
        this.directory = directory;
    }

    public void parse(String fileName, LineHandler handler) throws IOException {
        var reader = new BufferedReader(new FileReader(directory + fileName));
        String line;
        while((line = reader.readLine())!= null) {
            handler.handleLine(line);
        }
    }

}
