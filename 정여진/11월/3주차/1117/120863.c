#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* p) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int c,t,x=0,s=0,n=0,f=0;
    char* ans = (char*)malloc(500);

    for(c=0;t=p[c];c++) {
        if(t>='0'&&t<='9') { 
            f=1; 
            n=n*10+t-'0';
        }
        else {
            if(t == 'x') {
                x += n?n:!f;
            } else {
                s += n;
            }
            n = 0;
            f = 0;
        }
    }
    if(n)s+=n;
    if(x&&s) {
        if(x>1) sprintf(ans,"%dx + %d",x,s);
        else sprintf(ans,"x + %d",s);
    }
    else if(x&&!s) sprintf(ans,x>1?"%dx":"x",x);
    else sprintf(ans,"%d",s);
    //printf("%d %d\n",x,s);

    return ans;
}