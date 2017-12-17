import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsStr = scanner.nextLine().split("\\s");

        long[] numbers = new long[numbersAsStr.length];
        for (int i = 0; i < numbersAsStr.length; i++) {
            numbers[i] = Long.parseLong(numbersAsStr[i]);
        }
        long len = 1;
        long bestLen = 1;
        int bestStart = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i+1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    len++;
                }
            }
            if (len > bestLen)
            {
                bestLen = len;
                bestStart = i;
            }
            len = 1;
        }
        System.out.println(numbers[bestStart]);
    }
}
