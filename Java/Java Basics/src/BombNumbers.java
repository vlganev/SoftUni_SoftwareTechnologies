import java.util.Scanner;
import java.util.stream.IntStream;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsStr = scanner.nextLine().split("\\s");

        int[] numbers = new int[numbersAsStr.length];
        for (int i = 0; i < numbersAsStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStr[i]);
        }

        String[] bombNumbersAsStr = scanner.nextLine().split("\\s");

        int[] bombNumbers = new int[bombNumbersAsStr.length];
        for (int i = 0; i < bombNumbersAsStr.length; i++) {
            bombNumbers[i] = Integer.parseInt(bombNumbersAsStr[i]);
        }
        int bombNumber = bombNumbers[0];
        int power = bombNumbers[1];

        while (IntStream.of(numbers).anyMatch(x -> x == bombNumber))
        {
            int index = getArrayIndex(numbers, bombNumber);
            int lastPower = numbers.length - index;

            for (int i = index+power; i >= index-power; i--)
            {
                if (i < 0 || i >= numbers.length)
                {
                    continue;
                }
                else
                {
                    numbers = removeElement(numbers, i);
                }
            }
        }
        int totalSum = IntStream.of(numbers).sum();
        System.out.println(totalSum);
    }

    public static int getArrayIndex(int[] arr,int value) {
        for(int i=0;i<arr.length;i++)
            if(arr[i]==value) return i;
        return -1;
    }

    public static int[] removeElement(int[] original, int element){
        int[] n = new int[original.length - 1];
        System.arraycopy(original, 0, n, 0, element );
        System.arraycopy(original, element+1, n, element, original.length - element-1);
        return n;
    }

}
