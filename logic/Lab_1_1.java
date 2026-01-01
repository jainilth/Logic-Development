import java.util.Scanner;

class Lab_1_1 {
    public static void main(String[] args) {
        // int n ,sum=0;

        // System.out.println("Enter no");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        //     sum+=arr[i];
        // }
      
        // System.out.println("sum"+sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int originalN = n;
        int sum = 0;
        while (n != 1 && n != 4) {
            sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        if (sum == 1) {
            System.out.println(originalN + " is a happy number.");
        } else {
            System.out.println(originalN + " is not a happy number.");
        }
    }
}