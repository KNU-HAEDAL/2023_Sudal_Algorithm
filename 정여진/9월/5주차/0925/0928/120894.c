#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
long long solution(const char* numbers) {
    long long answer = 0;
    
    for(int i=0;i<strlen(numbers);i++) {
        
        int n=0 ;
        
        if(numbers[i]=='o') n=1, i+=2;
        else if (numbers[i]=='t') {
            if (numbers[i+1]=='w') n=2, i+=2 ;
            else n=3, i+=4 ;
        }
        else if (numbers[i]=='f') {
            if (numbers[i+1]=='o') n=4, i+=3 ;
            else n=5, i+=3 ;
        }
        else if (numbers[i]=='s') {
            if (numbers[i+1]=='i') n=6, i+=2 ;
            else n=7, i+=4 ;
        }
        else if (numbers[i]=='e') n=8, i+=4 ;
        else if (numbers[i]=='n') n=9, i+=3 ;
        else if (numbers[i]=='z') n=0, i+=3 ;
        
        answer = answer*10+n ;
        }
    return answer;
}