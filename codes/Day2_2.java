import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day2_2 {

    private static final String FORWARD = "forward";
    private static final String DOWN = "down";
    private static final String UP = "up";

    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        Scanner scanner = new Scanner(new FileReader(args[0]));
        Position position = new Position();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] details = line.split(" ");
            position.move(details[0], Integer.parseInt(details[1]));
        }
        System.out.println(position.getValue());
    }

    static class Position {
        int x;
        int y;
        int aim;

        Position() {
            x = 0;
            y = 0;
            aim = 0;
        }

        public void move(String direction, int value) throws IllegalAccessException {
            if (direction.equals(UP)) {
                aim -= value;
            } else if (direction.equals(FORWARD)) {
                x += value;
                y += value * aim;
            } else if (direction.equals(DOWN)) {
                aim += value;
            } else {
                throw new IllegalAccessException("Not a valid direction");
            }
        }

        public long getValue() {
            return ((long) x) * ((long) y);
        }
    }

}
