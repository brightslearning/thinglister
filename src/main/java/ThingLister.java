public class ThingLister {


    public void run(String filename) throws Exception {
        new FileParser().parseFile(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
