#include <stdio.h>

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int a[n];  
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int b, c;
    printf("Enter element to insert and position (0-based index): ");
    scanf("%d %d", &b, &c);

    int d[n+1]; 
    for (int i = 0; i < n + 1; i++) {
        if (i == c) {
            d[i] = b; 
        } else if (i < c) {
            d[i] = a[i]; 
        } else {
            d[i] = a[i - 1];
        }
    }

    printf("Array after insertion: ");
    for (int i = 0; i < n + 1; i++) {
        printf("%d ", d[i]);
    }
    return 0;
}
