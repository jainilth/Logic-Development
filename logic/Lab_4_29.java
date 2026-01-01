import java.util.Scanner;

public class Lab_4_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size= ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter serch element = ");
        int element = sc.nextInt();
        check(arr,element,0);
    }
    public static void check (int arr[] , int element ,  int index){
        if (index == arr.length) {
            System.out.println("Element not found ");
        }

        if(arr[index] == element){
            System.out.println(index);
        }
        else{
            check(arr,element,index+1);
        }
    }
}