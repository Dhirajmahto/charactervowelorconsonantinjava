import java.util.Scanner;

public class classarea {
    public static void main(String[] args) {
        int l, b, area;
        System.out.print("enter valu for side");
        Scanner r = new Scanner(System.in);
        l = r.nextInt();
        b = r.nextInt();
        area = l * b;
        System.out.print("area of rectangle" + area);
    }
}
