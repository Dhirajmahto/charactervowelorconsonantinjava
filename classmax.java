import java.util.Scanner;

public class classmax {
    public static void main(String[] args) {
        int a, b;
        System.out.print("enter the two numbers");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}