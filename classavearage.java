import java.util.Scanner;

public class classavearage {
    public static void main(String[] args) {
        int a, b, c, d, e;
        System.out.print("enter marks of five subject");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        d = r.nextInt();
        e = r.nextInt();
        int sum = a + b + c + d + e;
        System.out.print("total marks" + sum);
        double average = sum / 5.0;
        System.out.print("average marks" + average);
    }
}
