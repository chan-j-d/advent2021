import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(args[0]));
        System.out.println(countIncreases(scanner));
    }

    static int countIncreases(Scanner scanner) {
        int currentDepth = Integer.MAX_VALUE;
        int count = 0;
        while (scanner.hasNextInt()) {
            int readValue = scanner.nextInt();
            if (readValue > currentDepth) {
                count++;
            }
            currentDepth = readValue;
        }
        return count;
    }

}
