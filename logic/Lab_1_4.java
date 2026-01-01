import java.util.Scanner;

public class Lab_1_4 {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter no");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int rem;

        while(n>0){
            // rem = n%10;
            // sum = sum + rem;
            // n = n/10;
            rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }
        System.out.println("Sum: " + sum);
    }
}
