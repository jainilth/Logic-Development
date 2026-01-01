import java.util.Scanner;

public class Lab_4_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String = ");
        String str = sc.nextLine();
        int min = Integer.MAX_VALUE;
        String repeatingChar ="";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)== str.charAt(j)) {
                    int length = Math.abs(j-i);
                    if(length < min){
                        min = length;
                        repeatingChar = String.valueOf(str.charAt(i));
                    }
                }
            }
        }
        System.out.println("-----RESULT-----");
        if (min == Integer.MAX_VALUE) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("The minimum distance between two identical characters is:"+min);
            System.out.println("This distance was found with the character: " +repeatingChar);

        }
    }
}
