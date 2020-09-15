public class DogsParser implements LineParser {
    @Override
    public void parseLine(String[] split) {
        if (split.length == 2) {
            System.out.println(split[0] + " is " + split[1] + "'s dog");
        } else if (split.length == 1) {
            System.out.println(split[0] + "is a stray dog");
        }
    }
}
