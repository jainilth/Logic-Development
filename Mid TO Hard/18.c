#include <stdio.h>

int main() {
    int arr1[] = {2, 3, 5, 7, 9, 2};
    int arr2[] = {2, 5, 5, 9, 10, 2};
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    int used[100] = {0};
    
    int result[100];
    int k = 0;       
    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            if (arr1[i] == arr2[j] && !used[j]) {
                result[k++] = arr1[i];
                used[j] = 1;
                break;
            }
        }
    }
    
    printf("Stored Intersection: ");
    for (int i = 0; i < k; i++) {
        printf("%d ", result[i]);
    }
    return 0;
}
