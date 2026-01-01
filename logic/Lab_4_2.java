import java.util.Scanner;

public class Lab_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            if(i*(i+1)==n){
                System.out.println("pronic Number");
                return;
            }
        }
        System.out.println("Not a Triangular Number");
    }
}
