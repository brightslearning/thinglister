public class ThingsHandler implements LineHandler {

    private final FileParser fileParser;

    public ThingsHandler(FileParser fileParser) {
        this.fileParser = fileParser;
    }

    @Override
    public void handleLine(String line) {
        var split = line.split(";");
        String type = split[0];
        String file = split[1];
        try {
            switch (type) {
                case "dogs":
                    fileParser.parseDogs("src/main/resources/" + file);
                    break;
                case "people":
                    fileParser.parsePeople("src/main/resources/" + file);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
