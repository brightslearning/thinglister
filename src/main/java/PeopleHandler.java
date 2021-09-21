public class PeopleHandler implements LineHandler {
    @Override
    public void handleLine(String line) {
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
