#include<stdio.h>

main()
{
    int i, n, A[100];
    scanf("%d", &n);
    for (i = 0; i != n; i++)
    {
        A[i] = i;
        i = i + 1;
    }
}