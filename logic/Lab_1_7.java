import java.util.Scanner;

public class Lab_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p, sum = 0 ;
        System.out.println("Enter base ");
        n = sc.nextInt();
        System.out.println("Enter power ");
        p = sc.nextInt();
        for (int i = 0; i <=p; i++) {
            sum = sum*n;
        }
        System.out.println(sum);
    }
}
