public class Lab_4_17 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i+1; j++) {
                int temp = j;
                int def = n;
                if (j%2==0) {
                    System.out.print("*");
                }
                else if (j==1) {
                    System.out.print("1");
                }
                else{
                    temp = n;
                    System.out.print(" "); 
                }   
            }
            System.out.println(" ");
        }
    }
}
