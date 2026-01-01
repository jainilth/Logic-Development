public class Lab_4_15 {
    public static void main(String[] args) {
            int n =9;
            for(int i=1; i<=n ; i++){
                for (int j = 1; j <=n; j++) {
                    if(i == n/2+1 || j == n/2+1|| (j>n/2 && i ==1) || (j==1 &&i<=n/2) || (j<=n/2 && i==n) || (i>n/2 && j==n)){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                    
                }
                System.out.println("");
            }
    }
}
