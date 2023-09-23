#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int age) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* answer = (char*)malloc(sizeof(char)*4);
    sprintf(answer, "%d", age) ;
    for (int i=0;i<strlen(answer);i++) {
        answer[i]+=49 ; // a=97, 0=48
    }
    return answer;
}