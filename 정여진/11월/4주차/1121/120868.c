#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 0;
    int t ;
    if (sides[0]>sides[1]) {
        t=sides[0] ;
        sides[0]=sides[1] ;
        sides[1]=t;
    }
    answer=2*sides[0]-1 ;
    return answer;
}