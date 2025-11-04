#include <stdio.h>

int main() {
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    int rev;
    while(n>0){
        rev=n%10;
        printf("%d",rev);
        n/=10;
    }
    return 0;
}