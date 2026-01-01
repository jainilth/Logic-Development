import java.util.Scanner;

public class Tower41 {
    static void ways(int n,char s,char h,char d){
        if(n==0) return;
        ways(n-1,s,d,h);
        System.out.println("move disk "+n+" from rod "+s+" to "+d);
        ways(n-1,h,s,d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of disks");
        int n=sc.nextInt();
        ways(n,'1','2','3');
        sc.close();
    }
}
