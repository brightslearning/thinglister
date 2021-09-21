import java.io.BufferedReader;
import java.io.FileReader;

public class ThingLister {

    void run(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        ThingsHandler lineHandler = new ThingsHandler(new FileParser());
        lineHandler.addHandler("dogs", new DogHandler());
        lineHandler.addHandler("people", new PeopleHandler());
        while((line = reader.readLine())!= null) {
            lineHandler.handleLine(line);
        }
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
