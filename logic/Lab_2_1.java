import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        // int max = (n1 > n2) ? n1 : n2;
        for(int i=n1 ; i<=n2 ; i++){
            if (i%2==0 ) {
                System.out.println(i);
            }
        }
    }
}
