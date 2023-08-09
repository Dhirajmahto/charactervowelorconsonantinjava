import java.util.Scanner;

public class classpower {
    public static void main(String[] args) {
        int i, n, p, result = 1;
        System.out.print("enter no");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.print("entr power");
        p = r.nextInt();
        for (i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.print("power" + result);
    }
}
