import java.util.Scanner;

public class Lab_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int square = n * n;
        int noOfdeigits = Integer.toString(n).length();
        // Math.pow(Base, power);
        int rightPart = square % (int) Math.pow(10, noOfdeigits);
        System.out.println(rightPart);
        int leftPart = square / (int) Math.pow(10, noOfdeigits);
        System.out.println(leftPart);
        if (leftPart + rightPart == n) {
            System.out.println(n + " is a Kaprekar Number");
        } else {
            System.out.println(n + " is not a Kaprekar Number");
        }
        
    }
}
