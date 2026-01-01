import java.util.Scanner;

public class Lab_4_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees=");
        int rupees = sc.nextInt();
        System.out.print("Enter price=");
        int price = sc.nextInt();
        int chocolate = rupees/price;
        int wapper = chocolate;
        System.out.println("Enetr no of wapper for get extra chocolate =");
        int k = sc.nextInt();
        int chocolate_2=0;
        while (wapper>k) {
            chocolate_2 = wapper/k;
            wapper = wapper/k;
            chocolate+=chocolate_2;
            wapper ++;            
        }
        System.out.println(chocolate);
        sc.close();

    }
}
