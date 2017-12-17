import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String charAsStr = scanner.nextLine();

        char[] chars = charAsStr.toCharArray();

        for (char ch : chars)
        {
            int n = (int)ch % 32 - 1;
            System.out.println(ch + " -> " + n);
        }
    }
}
