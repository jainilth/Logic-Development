import java.util.Scanner;

public class Lab_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        System.out.print("Enter the position to insert the element (0 to " + n + "): ");
        int position = sc.nextInt();
        if (position < 0 || position > n) {
            System.out.println("Invalid position!");
            return;
        }
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
    }
}
