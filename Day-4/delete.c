#include <stdio.h>

int main() {
    int arr[] = {1, 5, 3, 6, 8, 2, 10};
    int n = sizeof(arr) / sizeof(arr[0]);
    int arr2[n];  
    int index;

    printf("Please enter index which you want to delete (0 to %d): ", n-1);
    scanf("%d", &index);

    if (index < 0 || index >= n) {
        printf("Invalid index\n");
        return 1;
    }

    for (int i = 0; i < n - 1; i++) {
        if (i >= index) {
            arr2[i] = arr[i + 1];
        } else {
            arr2[i] = arr[i];
        }
    }

    printf("Array after deletion: ");
    for (int i = 0; i < n - 1; i++) {
        printf("%d ", arr2[i]);
    }
    return 0;
}
