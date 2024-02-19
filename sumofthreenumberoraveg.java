import java.util.*;
public class sumofthreenumberoraveg {
    public static void main(String[] args){
        System.out.print("Enter your first number=");
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();
        System.out.print("Enter your second number=");
        int b=sc.nextInt();
        System.out.print("Enter your thrid number=");
        int c=sc.nextInt();
        int sum=a+b+c;
        int avg=(a+b+c)/3;
        System.out.println("sum of three numbers="+sum);
        System.out.println("avg of three numbers="+avg);
    }
}
