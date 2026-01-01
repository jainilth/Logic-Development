import java.util.Scanner;

public class Lab_3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to delete: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0; 
                break; 
            }
            
        }
    }
}
