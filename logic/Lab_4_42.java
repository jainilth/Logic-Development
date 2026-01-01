public class Lab_4_42 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.findNthDigit(11);   // Test with n = 11
    }
}

class Solution {
    public int findNthDigit(int n) {
        System.out.println("Input n = " + n);

        long digitLength = 1;  
        long count = 9;        
        long start = 1;        

        System.out.println("\n=== Step 1: Finding the digit group ===");

        while (n > digitLength * count) {
           

            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;

        }

       
        long number = start + (n - 1) / digitLength;

    
        int index = (int) ((n - 1) % digitLength);

      
        String numberStr = Long.toString(number);
        char digit = numberStr.charAt(index);
        return digit - '0';
    }
}
