import java.util.Scanner;

public class classeven {
    public static void main(String[] args) {
        int n;
        int i;
        System.out.print("enetr the any numaber:");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (i = 1; 1 <= n; i = i + 2) {
            System.out.print(i);
        }
    }
}