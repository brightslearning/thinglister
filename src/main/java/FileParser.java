import java.io.BufferedReader;
import java.io.FileReader;

public class FileParser {

    private void parseDogs(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        LineHandler dogHandler = new DogHandler();
        while((line = reader.readLine())!= null) {
            dogHandler.handleLine(line);
        }
    }

    private void parsePeople(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        LineHandler peopleHandler = new PeopleHandler();
        while((line = reader.readLine())!= null) {
            peopleHandler.handleLine(line);
        }
    }

    void parseFile(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        while((line = reader.readLine())!= null) {
            var split = line.split(";");
            String type = split[0];
            String file = split[1];
            switch (type) {
                case "dogs":
                    parseDogs("src/main/resources/" + file);
                    break;
                case "people":
                    parsePeople("src/main/resources/" + file);
                    break;
            }
        }
    }
}
