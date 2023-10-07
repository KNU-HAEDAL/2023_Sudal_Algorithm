#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* s) {
    int answer = 0;
    int data[1000]={} ;
    int t=0, cnt=0 ;
    for (int i=0;i<strlen(s);i++) {
        if (s[i]=='-') {
            i++ ;
            while (s[i]>='0' && s[i]<='9') {
                t*=10 ;
                t+=s[i]-'0' ;
                i++ ;
            }
            t*=-1 ;
            data[cnt++]=t ;
            t=0 ;
        }
        if (s[i]>='0' && s[i]<='9') {
            t+=s[i]-'0' ;
            i++ ;
            while(s[i]>='0' && s[i]<='9') {
                t*=10 ;
                t+=s[i]-'0' ;
                i++ ;
            }
            data[cnt++]=t ;
            t=0 ;
        }
        if(s[i]=='Z') data[--cnt]=0 ;
    }
    for (int i=0;i<cnt;i++) answer+=data[i] ;
    
    return answer;
}