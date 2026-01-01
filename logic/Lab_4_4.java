import java.util.Scanner;
import java.lang.Math;

public class Lab_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        double square = Math.pow(n, 2);
        int noOfdigits = Integer.toString(n).length();
        int rightPart = (int)(square % Math.pow(10, noOfdigits));
        int leftPart = (int)(square / Math.pow(10, noOfdigits));
        if (rightPart == n){
            System.out.println(n + " is a Automorphic Number");
        } else {
            System.out.println(n + " is not a Automorphic Number");
        }
    }
}