#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int f(int a, int b) {
    if (a%b==0) return b ;
    return f(b, a%b) ;
}

int solution(int a, int b) {
    int answer = 0;
    b/=f(b,a) ;
    while (1) {
        if (b%2==0) b/=2;
        else if (b%5==0) b/=5;
        else break;
    }
    if (b==1) answer=1;
    else answer=2;
    return answer;
}