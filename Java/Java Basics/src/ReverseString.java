import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1 = input1.reverse();
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
    }
}
