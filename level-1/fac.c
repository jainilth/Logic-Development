#include <stdio.h>

int main() {
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    int fac=1;
    for(int i=1;i<=n;i++){
        fac*=i;
    }
    printf("fac of given number is:%d",fac);
    return 0;
}