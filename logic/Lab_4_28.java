import java.util.Scanner;

public class Lab_4_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter srting like(a2b3dc5t...)");
        String str = sc.nextLine();
        StringBuilder rBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0 ;
            if (Character.isDigit(ch)) {
                count = Character.getNumericValue(ch);
                for (int j = 0; j < count; j++) {
                    rBuilder.append(str.charAt(i+1));
                }
            }
            else{
                rBuilder.append(str.charAt(i));
            }
        }
        System.out.println(rBuilder.toString());
    }
}
