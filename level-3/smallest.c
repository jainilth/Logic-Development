#include <stdio.h>
int main() {
    int n, i, smallest;
    printf("Enter size: ");
    scanf("%d", &n);
    int arr[n];
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    smallest = arr[0];
    for(i = 1; i < n; i++)
        if(arr[i] < smallest)
            smallest = arr[i];
    printf("Smallest = %d\n", smallest);
    return 0;
}
