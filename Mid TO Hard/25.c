#include <stdio.h>

int choco(int money, int prPerChoco, int wprPerChoco){
    int chocolate = money/ prPerChoco;
    int wrappers = chocolate;
    while (wrappers >= wprPerChoco)
    {
        wrappers = wrappers - wprPerChoco + 1;
        chocolate++;
    }
    return chocolate;
}

int main()
{
    printf("%d",choco(15,1,3));
    return 0;
}

