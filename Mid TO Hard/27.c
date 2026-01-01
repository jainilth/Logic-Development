#include <stdio.h>

int main()
{
    int n = 5;
    int isnumber=0;
    int a[] = {7,8,4,5,2};
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
            if (a[i] > a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    int rem = sum % 3;
    int removed=0;
    if (sum % 3 == 0)
    {
        for (int i = 0; i < 4; i++)
        {
            printf("%d ", a[i]);
        }
    }
    else
    {
        for (int i = n - 1; i >= 0; i--)
        {
            if (a[i] % 3 == rem)
            {
                a[i] = -1;
                removed=1;
                break;
            }
        }
    }
    if(!removed){
        int removedcounts=0;
        int needed=(3-rem);
        for(int i=n-1;i>=0;i--){
            if(a[i]!=-1&&a[i]%3==needed){
                a[i]=-1;
                removedcounts++;
            }
        }
    }
    for (int i = 0; i < 5; i++)
    {
        if (a[i] != -1)
        {
            printf("%d ", a[i]);
        }
    }
    return 0;
}

// #include <stdio.h>

// int digits[] = {1,3,3};
// int n = 3;

// int used[10];
// int subset[10];
// int subSize;

// int maxDiv3 = -1;

// void swap(int *a, int *b) {
//     int temp = *a;
//     *a = *b;
//     *b = temp;
// }

// void permute(int arr[], int l, int r) {
//     if (l == r) {
//         long num = 0;
//         for (int i = 0; i <= r; i++)
//             num = num * 10 + arr[i];

//         if (num % 3 == 0 && num > maxDiv3)
//             maxDiv3 = num;
//         printf("%ld\n", num);
//         return;
//     }

//     for (int i = l; i <= r; i++) {
//         swap(&arr[l], &arr[i]);
//         permute(arr, l + 1, r);
//         swap(&arr[l], &arr[i]);
//     }
// }

// void generateSubsets(int idx) {
//     if (idx == n) {
//         if (subSize > 0) {
//             int arr[10];
//             for (int i = 0; i < subSize; i++)
//                 arr[i] = subset[i];

//             permute(arr, 0, subSize - 1);
//         }
//         return;
//     }

//     subset[subSize++] = digits[idx];
//     generateSubsets(idx + 1);

//     subSize--;
//     generateSubsets(idx + 1);
// }

// int main() {
//     printf("Generated integers:\n");
//     generateSubsets(0);

//     printf("\nMax divisible by 3: %d\n", maxDiv3);

//     return 0;
// }