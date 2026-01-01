import java.util.Arrays;
import java.util.Scanner;

public class Lab_4_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 = ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2 = ");
        String s2 = sc.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Both the strings have the same characters with same frequency");
        }
        else if(s1.length()!=s2.length()){
            System.out.println("The strings have the not same length.");
        }
        else{
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch2);
            Arrays.sort(ch1);
            String s11 = new String(ch1);
            String s22 = new String(ch2);
            if (s11.equals(s22)) {
                System.out.println("The strings are **Anagrams**.");
                System.out.println("They have the same characters with the same frequency but in a different order.");
            }
            else{
                System.out.println("The strings have the same length but are neither identical nor anagrams.");
            }
   
        }
        sc.close();
    }
}
