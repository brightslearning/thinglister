import java.io.BufferedReader;
import java.io.FileReader;

public class FileParser {

    private void parseDogs(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        while((line = reader.readLine())!= null) {
            var split = line.split(";");
            if (split.length == 2) {
                System.out.println(split[0] + " is " + split[1] + "'s dog");
            } else if (split.length == 1) {
                System.out.println(split[0] + "is a stray dog");
            }
        }
    }

    private void parsePeople(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        while((line = reader.readLine())!= null) {
            var split = line.split(";");
            if (split.length == 3) {
                System.out.println(split[0] + ", " + split[1] + " and " + split[2] + " is in a polyamorous relationship.");
            } if (split.length == 2) {
                System.out.println(split[0] + " is in a relationship with " + split[1]);
            } else if (split.length == 1) {
                System.out.println(split[0] + "is single and ready to mingle");
            }
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
