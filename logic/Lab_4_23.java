
import java.util.Scanner;

public class Lab_4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size od arry ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array  element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enetr no of sifft element = ");
        int k = sc.nextInt();
        k=k%n;
        arr = revresr(arr,0,n);
        arr= revresr(arr,0,k);
        arr = revresr(arr,k,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static int [] revresr(int arr[],int lb,int n ){
       int low = lb;
       int hig = n-1;
       while (low<=hig) {
        int temp = arr[low];
        arr[low]= arr[hig];
        arr[hig]=temp;
        low++;
        hig--;
       }
       return (arr);
       
    }

}
