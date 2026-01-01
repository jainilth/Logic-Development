import java.util.Scanner;

public class Lab_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // if(2*3 == n){
        //     System.out.println(n + " is a ugly Number");
        //     return;
        // }
        // else if (2*5 == n){
        //     System.out.println(n + " is a ugly Number");
        //     return;
        // }
        // else if (3*5 == n){
        //     System.out.println(n + " is a ugly Number");
        //     return;
        // }
        // else if (2*3*5 == n){
        //     System.out.println(n + " is a ugly Number");
        //     return;
        // }
        // else if (n == 1){
        //     System.out.println(n + " is a ugly Number");
        //     return;
        // }
        // else{
        //     System.out.println(n + " is not a ugly Number");
            
        // }

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        if (n == 1) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an Ugly Number");
        }

    }
}
