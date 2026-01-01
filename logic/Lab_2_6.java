import java.util.Scanner;

public class Lab_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        int sum=0,rem;
        for(int i=1;i<n1;i++){
            rem = n1 % 10;
            sum = sum + rem;
            n1 = n1 / 10; 
        }
        if (sum == n1) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("The number is not a perfect number");
        }
    }
}
