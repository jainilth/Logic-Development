import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int rem,sum=0;
        int arr[] = new int[100];
        int index=0;
        while (true) {
            while (n > 0) {
                rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            }
            if (sum==1) {
                System.out.println("Happy Number");
                break;
            }
            else {
                n=sum;
                sum=0;
                for(int i=0;i<index;i++){
                    if(arr[i]==n){
                        System.out.println("Not a Happy Number");
                        return;
                    }
                    arr[index]=n; 
                }
                index++;
                continue;
            }

        }
    }
}