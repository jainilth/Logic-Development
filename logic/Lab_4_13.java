import java.util.Scanner;

public class Lab_4_13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Row: ");
    int r = sc.nextInt();
    System.out.print("Enter number of Column: ");
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    int num =1;
    for (int i = 0; i < r; i++) {
        if(i%2==0){
            for (int j = 0; j < c; j++) {
                matrix[i][j]=num++;
            }
        }
        else{
            for (int j = c-1; j >=0; j--) {
                matrix[i][j]= num++;            }
        }
    }
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print("  "+matrix[i][j]);
        }
        System.out.println("");
    }
    sc.close();
    }
}
