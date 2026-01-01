import java.util.Scanner;

public class Lab_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        int lcm = (n1 < n2) ? n1 : n2;
        int mul = n1*n2;
        int min = n1<n2 ? n1 : n2;
        for (int i = min ; i <= mul; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM = " + lcm);
    }
}
