import java.util.Arrays;
import java.util.Scanner;

public class Lab_4_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n*2];
        System.out.println("Enter element 1 ");
         for (int i = 0; i < arr2.length; i++) {
            arr1[i] = sc.nextInt();
        }
                System.out.println("Enter element 2 ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[n+i]= arr2[i];   
        }

        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
        int median = 0 ;
        if (arr3.length%2!=0) {
            median= arr3[arr3.length/2];
        }
        else{
            median = (arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2;
        }
        System.out.println("");
        System.out.println(median);
    }
}
