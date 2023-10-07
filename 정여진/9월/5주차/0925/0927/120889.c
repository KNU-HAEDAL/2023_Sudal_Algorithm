#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int s[3];
    for (size_t i = 0; i < sides_len; i++) {
        s[i] = sides[i];
    }

    for (size_t i = 0; i < 2; i++) {
        for (size_t j = 0; j < 2 - i; j++) {
            if (s[j] > s[j + 1]) {
                int t = s[j];
                s[j] = s[j + 1];
                s[j + 1] = t;
            }
        }
    }

    int sum = s[0] + s[1];
    return (sum > s[2]) ? 1 : 2;
}