import java.util.Arrays;
import java.util.Scanner;

public class Lab_4_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size od arr=");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enetr element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[2]-arr[n-2]);
        sc.close();
    }

}
