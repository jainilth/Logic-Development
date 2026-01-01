import java.util.Scanner;

public class Lab_1_3 {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter no");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum += i*i;
        }
        System.out.println(sum);
    }
}
