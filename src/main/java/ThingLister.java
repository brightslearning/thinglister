import java.io.BufferedReader;
import java.io.FileReader;

public class ThingLister {

    void run(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        ThingsHandler thingsHandler = new ThingsHandler(new FileParser("src/main/resources/"));
        thingsHandler.addHandler("dogs", new DogHandler());
        thingsHandler.addHandler("people", new PeopleHandler());
        while((line = reader.readLine())!= null) {
            thingsHandler.handleLine(line);
        }
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
