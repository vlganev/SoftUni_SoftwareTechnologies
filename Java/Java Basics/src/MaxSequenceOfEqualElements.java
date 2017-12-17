import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbersAsStr = scanner.nextLine().split("\\s");

        int[] numbers = new int[numbersAsStr.length];

        for (int i = 0; i < numbersAsStr.length; i++) {
            numbers[i]=Integer.parseInt(numbersAsStr[i]);
        }


        int len = 1;
        int start = 0;
        int bestLen = 1;
        int bestStart = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[start]) {
                len++;
                if (len > bestLen) {
                    bestLen = len;
                    bestStart = start;
                }
            } else {
                start = i;
                len = 1;
            }
        }
        for (int i = bestStart; i < bestStart + bestLen; i++) {
            System.out.printf(numbers[i] + " ");
        }
    }
}
