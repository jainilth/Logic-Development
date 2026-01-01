import java.util.Scanner;

public class Lab_4_11 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of positions: ");
        int d = sc.nextInt();
        System.out.println("Enter element : ");
        int x = sc.nextInt();
        for (int i = n ; i > d; i--) {
            arr[i] = arr[i - 1];
        }
        arr[d] = x;
        n++;
        
        System.out.println("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
