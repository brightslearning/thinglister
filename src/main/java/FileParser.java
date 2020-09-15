import java.io.*;

public class FileParser {

    private final LineParser lineParser;

    public FileParser(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    public void parseFile(String filename) {
        try {
            var reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#")) continue;
                var split = line.split(";");
                lineParser.parseLine(split);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

