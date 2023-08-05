import java.util.Scanner;

public class classconsonent {
    public static void main(String[] args) {
        char ch;
        int i;
        System.out.print("enetr the any charecter:");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print("vowel");
        } else {
            System.out.print("consonenet");
        }
    }
}
