// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

#include <stdio.h>

void main()
{
    int i = 1, j = 1, n = 5, gap, num;
    for (i = 1; i <= n; i++)
    {
        gap = n - 1;
        num = i;
        for (j = 1; j <= i; j++)
        {
            printf("%d", num);
            num += gap;
            gap--;
        }
        printf("\n");
    }
}