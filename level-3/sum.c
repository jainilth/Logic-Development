#include <stdio.h>
int main() {
    int n, i, sum = 0;
    printf("Enter n: ");
    scanf("%d", &n);
    for(i = 1; i <= n; i++) {
        for(int j=1;j<=i;j++){
            sum += j;
        }
    }
    printf("Sum = %d\n", sum);
    return 0;
}
