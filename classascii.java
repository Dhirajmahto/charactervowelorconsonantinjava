import java.util.Scanner;

public class classascii {
    public static void main(String[] args) {
        char ch;
        System.out.print("enter the any charecter");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        int a = ch;
        System.out.print("ASCII VALUE OF " + ch + a);
    }
}
