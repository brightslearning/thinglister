

public class ThingLister {


    public void run(String filename) throws Exception {
        ThingsParser thingsParser = new ThingsParser("src/main/resources/")
            .add("dogs", new FileParser(new DogsParser()))
            .add("people", new FileParser(new PeopleParser()));

        FileParser parser = new FileParser(thingsParser);
        parser.parseFile(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
