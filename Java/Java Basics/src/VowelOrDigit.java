import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i') {
            System.out.println("vowel");
        } else if (Character.isDigit(c)) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
