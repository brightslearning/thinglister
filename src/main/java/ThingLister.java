public class ThingLister {

    void run(String filename) throws Exception {

        ThingsHandler thingsHandler = new ThingsHandler(new FileParser("src/main/resources/"));
        thingsHandler
                .addHandler("dogs", new DogHandler())
                .addHandler("people", new PeopleHandler());

        thingsHandler.handleThings(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
