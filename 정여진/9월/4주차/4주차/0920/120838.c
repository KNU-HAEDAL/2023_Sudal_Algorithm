#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* letter) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char *morse[]= { 
    ".-","-...","-.-.","-..",".","..-.",
    "--.","....","..",".---","-.-",".-..",        
    "--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-",
    "-.--","--.."};
    int x=0;
    char* answer = (char*)malloc(1000);
    char* cut_morse=strtok(letter, " ");
    memset (answer, 0, 1000) ;
    
    while (cut_morse!=NULL) {
        for (int i=0;i<26;i++) {
            if (strcmp(cut_morse, morse[i])==0) {
                answer[x++]=97+i ;
                break ;
            }
        }
        cut_morse = strtok(NULL, " ") ;
    }
    return answer;
}