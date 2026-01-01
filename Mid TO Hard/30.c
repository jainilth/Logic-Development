#include <stdio.h>

int find(int arr[],int n){
    if(arr[0]==n){
        return 1;
    }
    else if(arr[0]==-1){
        return 0;
    }
    return find(arr+1,n);
}

int main() {
    int arr[]={1,2,3,4,5,6,-1};
    printf("%d ",find(arr,4));
    return 0;
}