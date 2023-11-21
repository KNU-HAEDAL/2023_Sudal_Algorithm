#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string) {
    int answer = 0;
    int n=0, t ;
    int l = strlen(my_string);    
    for(int i=0;i<=l;i++) {
        t = my_string[i];
        if(t>='0' && t<='9') n = 10*n+t-'0';
        else{ answer+=n; n=0; }
    }
    return answer;
}