import java.util.Scanner;

public class classgreatest {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("enter three number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        if (a >= b) {
            System.out.print(a);
        } else if (b >= c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }

    }
}