public class Lab_4_16 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <=5 ;i++) {
            int temp = i;
            for (int j = 1; j<=i; j++) {
                int def = n-j;
                System.out.print(temp); 
                temp+=def;
                // def--;   
            }
            System.out.println(" ");
        }
    }
}
