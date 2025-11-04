#include <stdio.h>

int main() {
    int start, end, i;
    printf("Enter start and end numbers: ");
    scanf("%d %d", &start, &end);
    printf("Numbers divisible by 2 between %d and %d:\n", start, end);
    for(i = start; i <= end; i++) {
        if(i % 2 == 0) {
            printf("%d ", i);
        }
    }
    printf("\n");
    return 0;
}
