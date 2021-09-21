import java.io.BufferedReader;
import java.io.FileReader;

public class FileParser {

    public void parseDogs(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        LineHandler dogHandler = new DogHandler();
        while((line = reader.readLine())!= null) {
            dogHandler.handleLine(line);
        }
    }

    public void parsePeople(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        LineHandler peopleHandler = new PeopleHandler();
        while((line = reader.readLine())!= null) {
            peopleHandler.handleLine(line);
        }
    }

}
