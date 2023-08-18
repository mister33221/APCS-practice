#include <stdio.h>

// APCS 大學程式設計先修檢測題

// main(){
//     printf("Hello World");
//     return 0;
// }

// no.5
// int A[8] = {8, 7, 6, 5, 4, 3, 2, 1};
// int main()
// {
//     int i, j;
//     for (i = 0; i < 8; i++)
//     {
//         for (j = i; j < 8; j++)
//         {
//             if (A[j] > A[j + 1])
//             {
//                 A[j] = A[j] + A[j + 1];
//                 A[j + 1] = A[j] - A[j + 1];
//                 A[j] = A[j] - A[j + 1];
//             }
//         }
//         for (i = 0; i < 8; i++)
//         {
//             printf("%d", A[i]);
//         }
//     }
// }

// no.8 跟解答不一樣
// int Q[200];
// int i, val = 0;
// int count = 0;
// int head = 0, tail = 0;
// int main()
// {
//     for (i = 1; i <= 30; i = i + 1)
//     {
//         Q[tail] = i;
//         tail = tail + 1;
//     }
//     while (tail > head + 1)
//     {
//         val = Q[head];
//         head = head + 1;
//         count = count + 1;
//         if (count == 3)
//         {
//             count = 0;
//             Q[tail] = val;
//             tail = tail + 1;
//         }
//     }
//     printf("%d", Q[head]);
// }


// no.9

//函式 f(a) 回傳小於福點數a的最大整數，但回傳型態仍為浮點數
// float f(float a){
//     int b = a;
//     return (float)b;
// }

// int main(){
//     float x = 10, y = 3;
//     if((0.5 * x / y - f(0.5 * x / y)) == 0.5 ){
//         printf("%f\n", f(0.5 * x / y) - 1);
//     } else if((0.5 * x / y - f(0.5 * x / y)) < 0.5){
//         printf("%f\n", f(0.5 * x / y));
//     }else{
//         printf("%f\n", f(0.5 * x / y) + 1);
//     }
//     return 0;
// }

// no.10
// void f(int x, int y){
//     int tem = x;
//     x = y;
//     y = tem;
// }

// int main(){
//     int a = 2, b = 3;
//     f(a, b);
//     printf("%d %d\n", a, b);
//     return 0;
// }

// note 
//     因為是call by value，所以在f()裡面的x, y是a, b的複製品，所以在f()裡面的x, y改變不會影響到a, b

// no.13 被我跳過了


// no.14

// int main(){
//     int a[101];
//     int b[101];
//     for(int i = 1; i <= 100; i++){
//         b[i] = i;
//     }
//     a[0] = 0;
//     for(int i = 1; i <= 100; i++){
//         a[i] = b[i] + a[i-1];
//     }
    
//     printf("%d\n", a[30]);
//     printf("%d\n", a[50] - a[30]);
// }

// note: 
//  a[0] = 0;
//  a[1] = 1; 
//  a[2] = 3;
//  a[3] = 6;
//  a[4] = 10;
//  a[5] = 15; // 可以理解為 答案為前面所有index的總和，可以用 上底加下底乘高除以二 來驗證

// no.15
// 題目
//  函數f定義如下，如果呼叫f(1000)，指令sum=sum+i會執行幾次？
// int f(int n){
//     int sum = 0;
//     if(n < 2){
//         return 0;
//     }
//     for(int i = 1; i <= n; i++){
//         sum = sum + i;

//     }
//     sum = sum + f(2 * n / 3);
//     return sum;
// }

// int main(){
//     f(1000);
// }


// no.16 跳過W