import java.util.Scanner;

public class classdigits {
    public static void main(String[] args) {
        int n, coutn = 0;
        System.out.print("enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        while (n > 0) {
            n = n / 10;
            coutn++;
        }
        System.out.print("digits number" + coutn);
    }
}
