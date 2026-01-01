import java.util.Scanner;

public class Lab_2_15 {
    public static void main(String[] args) {
        // 1+(1+2)+(1+2+3)+...+(1+2+3+...+n)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int Sum = 0;
        for (int i = 1; i <= n; i++) {
            int Sum2 = 0;
            for (int j = 1; j <= i; j++) {
                Sum2 += j;
            }
            Sum +=Sum2;
        }
        System.out.println("The total sum is: " + Sum);
        sc.close();
    }
}
