import java.util.*;

public class ThingsParser implements LineParser {

    private final Map<String, FileParser> parsers = new HashMap<>();
    private final String path;

    public ThingsParser(String path) {
        this.path = path;
    }

    public ThingsParser add(String type, FileParser parser) {
        parsers.put(type, parser);
        return this;
    }

    @Override
    public void parseLine(String[] split) {
        String type = split[0];
        String file = split[1];
        FileParser parser = parsers.get(type);
        parser.parseFile(path + file);
    }
}
