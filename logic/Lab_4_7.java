import java.util.Scanner;

public class Lab_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        int rem,sum=0,i=0;
        while (n>0) {
          rem = n % 8;
          n = n / 8;
          arr[i]=rem;
            i++;  
        }
        System.out.println("The octal number is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
