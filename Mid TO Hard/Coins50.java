public class Coins50 {
    public static void main(String[] args) {
        int coins[]={10,5,2,1};
        int sum=28;
        int tsum=0;
        int count=0;
        int i=0;
        while(sum!=tsum&&i<coins.length){
            if((coins[i]+tsum<=sum)){
                tsum+=coins[i];
                System.out.print(coins[i]+" ");
                count++;
                i--;
            }
            i++;
        }
        System.out.println("\n"+count);
    }
}
