#include <stdio.h>

int main() {
    int a, b, max, i;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    max = a > b ? a : b;
    i = max;
    while(1) {
        if(i % a == 0 && i % b == 0) {
            printf("LCM is %d\n", i);
            break;
        }
        i++;
    }
    return 0;
}
