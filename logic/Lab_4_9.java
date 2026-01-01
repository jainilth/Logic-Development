import java.util.Scanner;

public class Lab_4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        int rem,i=0;
        char hexChars[]={'A','B','C','D','E','F'};
        while (n>0) {
          rem = n % 16;
          n = n / 16;
          arr[i]=rem;
            i++;  
        }
        System.out.println("The hexadecimal number is: ");
        for (int j = i - 1; j >= 0; j--) {
            if(arr[j]>=10){
                System.out.print(hexChars[arr[j]-10]);
            }
            else{
                System.out.print(arr[j]);
            }
        }

    }
}
