import java.util.Scanner;

public class classtex {
    public static void main(String[] args) {
        int sal;
        double tex;
        System.out.print("enetr salary");
        Scanner r = new Scanner(System.in);
        sal = r.nextInt();
        if (sal <= 10000) {
            System.out.print(sal + "no tax");
        } else if (sal >= 10000 && sal <= 100000) {
            tex = sal * 0.10;
            System.out.print(sal + " " + tex);
        } else if (sal >= 100001) {
            tex = sal * 0.20;
            System.out.print(sal + " " + tex);
        }
    }

}