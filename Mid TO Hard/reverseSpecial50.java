import java.util.Scanner;
import java.util.Stack;

public class reverseSpecial50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        String result = "";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){
                st.push(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){
                result+=st.pop();
            }
            else{
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
