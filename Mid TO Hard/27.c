#include <stdio.h>

int digits[] = {1,3,3};
int n = 3;

int used[10];
int subset[10];
int subSize;

int maxDiv3 = -1;

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void permute(int arr[], int l, int r) {
    if (l == r) {
        long num = 0;
        for (int i = 0; i <= r; i++)
            num = num * 10 + arr[i];

        if (num % 3 == 0 && num > maxDiv3)
            maxDiv3 = num;
        printf("%ld\n", num);
        return;
    }

    for (int i = l; i <= r; i++) {
        swap(&arr[l], &arr[i]);
        permute(arr, l + 1, r);
        swap(&arr[l], &arr[i]);
    }
}

void generateSubsets(int idx) {
    if (idx == n) {
        if (subSize > 0) {
            int arr[10];
            for (int i = 0; i < subSize; i++)
                arr[i] = subset[i];

            permute(arr, 0, subSize - 1);
        }
        return;
    }

    subset[subSize++] = digits[idx];
    generateSubsets(idx + 1);

    subSize--;
    generateSubsets(idx + 1);
}

int main() {
    printf("Generated integers:\n");
    generateSubsets(0);

    printf("\nMax divisible by 3: %d\n", maxDiv3);

    return 0;
}
