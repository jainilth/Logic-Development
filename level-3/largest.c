#include <stdio.h>
int main() {
    int n, i, largest;
    printf("Enter size: ");
    scanf("%d", &n);
    int arr[n];
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    largest = arr[0];
    for(i = 1; i < n; i++)
        if(arr[i] > largest)
            largest = arr[i];
    printf("Largest = %d\n", largest);
    return 0;
}
