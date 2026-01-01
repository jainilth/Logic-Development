import java.util.Scanner;

public class Lab_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1=");
        int n1 = sc.nextInt();
        System.out.println("Enter no2=");
        int n2= sc.nextInt();
        int sum  = 0;
        for(int i=1 ; i<=n1 ; i++){
            sum = sum + n2;
        }
        System.out.println("Multiplication = " + sum);

    }
}
