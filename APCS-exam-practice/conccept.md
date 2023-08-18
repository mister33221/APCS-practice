1. 
    Q: 給定右側城市片段，哪個n值不會造成超過陣列A的存取範圍
    ```c++
    int i, n, A[100];
    scanf("%d", &n);
    for (i = 0; i < n; i=i+1){
        A[i] = i;
        i = i + 1;
    }
    ```
    (A) 69 (B) 98 (C) 98 (D) 202

    A: (C) 98

2. 
    Q: 給定右側函示f()，當執行f(10)時，最終回傳結果為?
    ```c++
    int f(int i){
        if(i>0){
            if((i/2)%2==0){
                return f(i-2)*i;
            }else{
                return f(i-2)*(-i);
            }else{
                return 1;
            }
        }
    }
    ```
    (A) 1 (B) 3840 (C) -3840 (D) 執行時導致無窮迴圈，不會停止執行

    A: (C) -3840

    EXP:
    f(10) = f(8) * (-10) 
            = f(6) * (-10) * (-8) 
            = f(4) * (-10) * (-8) * (-6) 
            = f(2) * (-10) * (-8) * (-6) * (-4) 
            = f(0) * (-10) * (-8) * (-6) * (-4) * (-2) 
            = 1 * (-10) * (-8) * (-6) * (-4) * (-2) = -3840

3. 
    Q: 給定右側程式片段，for回全總共會執行幾次?
    ```c++
    int i, j;
    for (i=0; i<128; i=i+j){
        j = i + 1;
    }
    ```
    (A) 8 (B) 32 (C) 64 (D) 128

    A: (A) 8

    EXP:
    for迴圈中的第三個參數表示在每次回圈執行後，要做的事情
    loop 1 : i = 0 + 0 = 0
            j = 0 + 1 = 1
    loop 2 : i = 0 + 1 = 1
            j = 1 + 1 = 2
    loop 3 : i = 1 + 2 = 3
            j = 3 + 1 = 4
    loop 4 : i = 3 + 4 = 7
            j = 7 + 1 = 8
    loop 5 : i = 7 + 8 = 15
            j = 15 + 1 = 16
    loop 6 : i = 15 + 16 = 31
            j = 31 + 1 = 32
    loop 7 : i = 31 + 32 = 63
            j = 63 + 1 = 64
    loop 8 : i = 63 + 64 = 127
            j = 127 + 1 = 128
    loop 9 : i = 127 + 128 = 255  // i < 128, break
            j = 255 + 1 = 256

4. 
    Q:給定右側程式，若已知輸出的結果為[1],[2],[3],[4],[5],[6]，程式中的(?)應為下列何者?
    ```c++
    int main(){
        int i, j;
        for(i = 0; i < 5; i = i + 1){
            for(j = 0; (?); j = j + 2){
                printf("[%d]", i + j); // printf 函數的格式化字符串是 [%d]，其中 %d 是一個格式化輸出的占位符，表示要輸出一個整數
            }
        }
    }
    ```
    (A) j < i (B) j > i (C) j <= i (D) j >= iW

    A: (A) j < i

    EXP:
    (C)跟(D)，在第一圈的時候就會印出[0]，因為j=0，i=0，所以j<=i或j>=i都會成立，所以會印出[0]，但是題目要求的是[1]，所以排除(C)跟(D)
    (B)在第一圈的時候就會印出[0]，因為j=0，i=0，所以j>i不成立，所以會印出[0]，但是題目要求的是[1]，所以排除(B)

5.
    Q: 
