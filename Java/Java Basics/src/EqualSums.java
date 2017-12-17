import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsStr = scanner.nextLine().split("\\s");

        long[] numbers = new long[numbersAsStr.length];
        for (int i = 0; i < numbersAsStr.length; i++) {
            numbers[i] = Long.parseLong(numbersAsStr[i]);
        }

        for (int i = 0; i < numbers.length; i++)
        {
            long sumLeft = 0;
            long sumRight = 0;
            for (int j = 0; j < i; j++)
            {
                sumLeft += numbers[j];
            }
            for (int k = i+1; k < numbers.length; k++)
            {
                sumRight += numbers[k];
            }
            if (sumLeft == sumRight)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
