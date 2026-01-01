import java.util.Scanner;

public class Lab_1_2 {
    public static void main(String[] args) {
        int n ,sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        n = sc.nextInt();
        while (n > 0) {
            sum = sum*n;
            n--;
        }
        System.out.println("Factorial: " + sum);
    }
}
