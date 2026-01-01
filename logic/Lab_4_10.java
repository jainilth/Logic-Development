import java.util.Scanner;

public class Lab_4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String str = sc.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch );
            } 
            else if (ch >= 'A' && ch <= 'F') {
                int decimalValue = ch - 'A' + 10;
                System.out.print(decimalValue );
            }
            else {
                System.out.println("Invalid character: " + ch);
            }
        }        
    }
}
