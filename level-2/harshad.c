#include <stdio.h>

int main() {
    int n, num, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    num = n;
    while(num != 0) {
        sum += num % 10;
        num /= 10;
    }
    if(n % sum == 0)
        printf("%d is a Harshad Number\n", n);
    else
        printf("%d is not a Harshad Number\n", n);
    return 0;
}
