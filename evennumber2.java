import java.util.Scanner;
public class evennumber2 {
    public static void main(String[] args){
        int n;
        System.out.print("Enter your number =");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(n=0; n<=num; n++){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}
