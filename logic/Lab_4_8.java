import java.util.Scanner;

public class Lab_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i=0;
        int rem, sum=0;
        while (n>0) {
            rem = n % 10;
            sum = sum + rem*(int)(Math.pow(8, i));
            i++;
            n = n / 10;
        }
        System.out.println("The decimal number is: " + sum);
    }
}
