import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Baseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(111, 1000);

        String ramdomString = Integer.toString(randomNumber);
        System.out.println("random number: " + randomNumber);

        System.out.println("숫자를 입력하세요");
        String inputString = scanner.nextLine();

        int strikeCount = calcStrike(ramdomString, inputString);

        System.out.println(inputString);
        System.out.println(strikeCount+ " strike");
    }

    public static int calcStrike(String ramdomString, String inputNumber) {
        int count = 0;
        String[] numberSplit = ramdomString.split("");
        String[] inputSplit = inputNumber.split("");

        for (int i = 0; i < numberSplit.length; i++) {
            if (numberSplit[i].equals(inputSplit[i])) {
                count++;
            }
        }
        return count;
    }
}
