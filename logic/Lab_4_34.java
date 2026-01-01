import java.util.Scanner;

public class Lab_4_34 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Binary no= ");  
     String str = sc.nextLine();
     int i=0,j=-1;
     int decimal =0;
     String[] s2 = str.split("\\.");  
   
    for (int k = s2[0].length()-1; k>=0; k--) {
        int bitValue = s2[0].charAt(k) - '0';
        decimal +=  bitValue * Math.pow(2, i);
        i++;
    }
    double decimal_2=0.0;
    for (int k = 0; k < s2[1].length(); k++) {
        int bitValue = s2[1].charAt(k) - '0';
        decimal_2 +=  bitValue * Math.pow(2, j);
        j--;

    }
    System.out.print(decimal+decimal_2);
    
    }
}
