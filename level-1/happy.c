#include <stdio.h>
int happy(int num){
    int sum=0;
    while (num>0)
    {
        int digit = num%10;
        sum+=(digit*digit);
        num/=10;
    }
    
    return sum;
}
int isHappy(int x){
    int n = happy(x);
    if(n==1){
        return 1;
    }else if(n==89){
        return 0;
    }else{
        return isHappy(n);
    }
}
int main() {
    int n = 20;
    if(isHappy(n)){
        printf("yes");
    }else{
        printf("no");
    }
    return 0;
}