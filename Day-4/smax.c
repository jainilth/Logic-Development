//all time right
#include<stdio.h>
#include<limits.h>
int main(){
    int a[7]={1,5,5,4,4,2,1};
    int max=a[0];
    int smax,min,smin=a[0];

    for (int i = 0; i < 7; i++)
    {
        if(max<a[i]){
            smax=max;
            max=a[i];
        }
        else if(smax<a[i]&&max!=a[i]){
            smax=a[i];
        }
        if(a[i] < min) {
            smin = min;
            min = a[i];
        } else if(a[i] < smin && a[i] != min)
            smin = a[i];
    }
    printf("%d ",max);
    printf("%d ",smax);
    printf("%d ",min);
    printf("%d ",smin);
    return 0;
}