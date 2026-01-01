import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter no");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
    }
}
