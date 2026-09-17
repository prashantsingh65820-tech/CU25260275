import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result;

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {
            result = "Vowel";
        } else {
            result = (ch >= 'A' && ch <= 'Z') ||
                     (ch >= 'a' && ch <= 'z')
                     ? "Consonant"
                     : (ch >= '0' && ch <= '9')
                     ? "Digit"
                     : "Special Symbol";
        }

        System.out.println(result);
    }
}