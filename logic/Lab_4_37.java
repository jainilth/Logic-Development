import java.util.Scanner;

public class Lab_4_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter rowXcol=");
        int n = sc.nextInt();
        int [][] metrix = new int[n][n];
        int [][] outMetrix = new int[n][n];
        System.out.println("Enter element");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                metrix[i][j]=sc.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0 ;
                for (int k = 0; k < n; k++) {
                    outMetrix[i][j]+= metrix[i][k]*metrix[k][j];
                }
                // outMetrix[i][j]=sum;
            }
        }
        System.out.println("____ANS____");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.println(outMetrix[i][j]);
            }
        }

    }
}
