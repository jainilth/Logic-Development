import java.util.Scanner;

public class Lab_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
