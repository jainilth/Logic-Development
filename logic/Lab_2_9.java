import java.util.Scanner;

public class Lab_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num=");
        int num = sc.nextInt();
        int a=0,b=1,sum=0;
        for (int i = 1; i <= num; i++) {
            System.out.print(a);
            sum=a+b;
            a=b;
            b=sum; 
        }
    }
}
