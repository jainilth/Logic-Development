import java.util.Scanner;

public class Lab_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 2 array element");
        int x = sc.nextInt();
        int arr2[] = new int[x];
        System.out.println("Enter the elements for second array:");
        for (int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }
        int maxLength = (n > x) ? n : x;
        int[] mergedArray = new int[maxLength];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if(arr[i] == arr2[j]) {
                    mergedArray[i] = arr[i];
                }
            }
        }
        System.out.println("Common elements are:");
        for (int i = 0; i < mergedArray.length; i++) {
            if(mergedArray[i] != 0) {
                System.out.println(mergedArray[i]);
            }
        }
    }
}
