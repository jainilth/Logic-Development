#include <stdio.h>
int main() {
    int h=3;
    int m=15;
    float hangle=30*h+(0.5*m);
    float mangle=6*m;
    float ans=hangle-mangle;
    ans=(ans<0)?ans*-1:ans;
    ans=(ans>180)?ans-180:ans;
    printf("%f",ans);
    return 0;
}