// #include <stdio.h>

// int main()
// {
//     int n = 15;
//     int s = 1;
//     int r = 2*n;
//     for (int i = 1; i <= n; i++)
//     {
//         if (i % 2 != 0 && i > 1)
//         {
//             s += n;
//         }
//         else if (i % 2 == 0)
//         {
//             if(i>2){
//                 r += (2*n)+n;
//             }
//         }
//         for (int j = 1; j <= n; j++)
//         {
//             if (i % 2 != 0)
//             {
//                 printf("%d ", s++);
//             }
//             else
//             {
//                 printf("%d ", r--);
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }
#include <stdio.h>

int main() {
    int n=5;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i%2==0) printf("%d ",n*i + (j+1));
            else printf("%d ",n*i + (n-j));
        }
        printf("\n");
    }
    return 0;
}