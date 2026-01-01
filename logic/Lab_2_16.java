import java.util.Scanner;

public class Lab_2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <=n; i++) {
            answer += n;
        }
        System.out.println( answer);
    }
}
