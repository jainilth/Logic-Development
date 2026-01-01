import java.util.Scanner;

public class Lab_2_7 {
    public static void main(String[] args) {
        //harshad number
        int n, sum = 0, temp, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if (temp % sum == 0) {
            System.out.println("The number is a Harshad number");
        } else {
            System.out.println("The number is not a Harshad number");
        }
    }
}
