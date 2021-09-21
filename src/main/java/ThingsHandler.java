import java.util.HashMap;
import java.util.Map;

public class ThingsHandler implements LineHandler {

    private final FileParser fileParser;
    Map<String, LineHandler> lineHandlers = new HashMap<>();

    public ThingsHandler(FileParser fileParser) {
        this.fileParser = fileParser;
    }

    public void addHandler(String type, LineHandler lineHandler) {
        lineHandlers.put(type, lineHandler);
    }

    @Override
    public void handleLine(String line) {
        var split = line.split(";");
        String type = split[0];
        String file = split[1];
        try {
            fileParser.parse(file, lineHandlers.get(type));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
