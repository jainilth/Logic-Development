import java.util.Scanner;

public class Lab_4_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String = ");
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        for 
        (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '-'){
                if (ch != '+') {
                    if (ch != ' ') {
                        stringBuffer.append(str.charAt(i));
                    }
                }
            }
        }
        sc.close();
        System.out.println(stringBuffer);
    }
}
