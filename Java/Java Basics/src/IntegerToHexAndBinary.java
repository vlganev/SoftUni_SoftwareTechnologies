import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printHexForm(number);
        System.out.println();
        printBinaryform(number);

    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number %2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }

    public static void printHexForm(int n) {
        String result =Integer.toHexString(n).toUpperCase();
        System.out.print(result);
    }
}
