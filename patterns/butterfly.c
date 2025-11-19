#include <stdio.h>

int main()
{
    int n = 4;
    int k=0;
    for (int i = 1; i <= 2*n-1; i++)
    {
        k=i;
        if(k>n){
            k=2*n-k;
        }
        for (int j = 1; j <= 2*n-1; j++)
        {
            if(j<=k||j>=2*n-k){
                if ((i+j)%2==0) 
                {
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}