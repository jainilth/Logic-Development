import java.util.Scanner;

public class Lab_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 2 arry element");
        int x = sc.nextInt();
        int arr2[] = new int[x];
        System.out.println("Enter the elements for second array:");
        for (int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] mergedArray = new int[n + x];
        for (int i = 0; i < n; i++) {
            mergedArray[i] = arr[i];
        }
        for (int i = 0; i < x; i++) {
            mergedArray[i + n] = arr2[i];
        }
        System.out.println("Merged array elements are:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i]);
        }
    }
}
