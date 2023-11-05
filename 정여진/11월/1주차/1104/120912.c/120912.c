#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    int num = 0 ;
    for(int i=0;i<array_len;i++) {
        num=array[i] ;
        while (num>0) {
            if (num%10==7) answer++ ;
            num/=10 ;
        }
    }
    return answer;
}