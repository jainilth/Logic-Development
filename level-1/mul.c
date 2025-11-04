#include <stdio.h>

int main() {
    int a, b, i, result = 0;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    for(i = 0; i < b; i++) {
        result += a;
    }
    printf("Product = %d\n", result);
    return 0;
}
