#include <stdio.h>
void main()
{
    int i, j, n;
    printf("Enter number of rows: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= 2 * i - 1; j++)
        {
            if (j % 2 == 0)
            {
                printf("*");
            }
            else if (j < i)
            {
                printf("%d", j);
            }
            else
            {
                printf("%d", 2 * i - j);
            }
        }
        printf("\n");
    }
}