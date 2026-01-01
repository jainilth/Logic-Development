import java.util.Scanner;

public class Lab_4_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr= ");
        int n = sc.nextInt();
        int count =0;
        int [] arr = new int[n];
        System.out.println("Enter sum =");
        int sum = sc.nextInt();
        System.out.println("Enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+ 1; j < arr.length; j++) {
                if (sum == arr[i]+arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("count ="+count);
    }
}
