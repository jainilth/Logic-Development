import java.util.Scanner;

public class Lab_4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nXm metrix");
        int n = sc.nextInt();
        int matrix[][]  = new int[n][n];
        System.out.println("enter element");
        System.out.println("enter ");
        int element =  sc.nextInt();
        int rowCount = 1 , colCount = n-2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j == n-1) {
                    matrix[i][j]=element+i; 
                }
                else if(i==rowCount || i == colCount || j == rowCount || j == colCount ){
                    matrix[i][j]=element;
                }  
            }
            rowCount ++; 
            colCount --;
            element -- ;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);               
            }
            System.out.println(" ");
        }
        sc.close();   
    }
}
