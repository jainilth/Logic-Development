#include <stdio.h>
#include <math.h>
int main()
{
    int n = 7;
    int m = n;
    int squ = n * n;
    int count = 0;
    while (n > 0)
    {
        count++;
        n /= 10;
    }
    int div = (int)round(pow(10, count));
    if ((squ % div) == m)
    {
        printf("Automorphic");
    }
    else printf("no");
    return 0;
}