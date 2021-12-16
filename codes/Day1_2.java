import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day1_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(args[0]));
        System.out.println(countIncreases(scanner));
    }

    static int countIncreases(Scanner scanner) {
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        int count = 0;
        while (scanner.hasNextInt()) {
            int readValue = scanner.nextInt();
            if (readValue > value1) {
                count++;
            }
            value1 = value2;
            value2 = value3;
            value3 = readValue;
        }
        return count;
    }

}
