import java.util.Scanner;

public class Lab_4_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 == 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
        else{
            for (int i = 0; i < arr.length-1; i++) {
                sum += arr[i];
                if (sum % 3 ==0) {
                    System.out.print(arr[i]);
                }
            }
        }
        sc.close();
    }
   public static void reverse(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
