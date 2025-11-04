#include <stdio.h>
int main() {
    int base, exp, i, j, temp, result = 1;
    printf("Enter base and exponent: ");
    scanf("%d %d", &base, &exp);
    for(i = 0; i < exp; i++) {
        temp = 0;
        for(j = 0; j < base; j++) {
            temp += result;
        }
        result = temp;
    }
    printf("%d\n", result);
    return 0;
}
