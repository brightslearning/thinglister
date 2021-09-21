import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    public void parse(String fileName, LineHandler handler) throws IOException {
        var reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine())!= null) {
            handler.handleLine(line);
        }
    }

}
