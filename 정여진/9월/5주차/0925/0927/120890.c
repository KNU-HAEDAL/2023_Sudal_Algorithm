#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <limits.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len, int n) {
    int answer = 0;
    int min = INT_MAX ;

    for (size_t i = 0; i < array_len; ++i) {
        int d = abs(array[i] - n);
        if (d < min) {
            min = d;
            answer = array[i];
        } else if (d == min) {
            answer = (answer < array[i]) ? answer : array[i];
        }
    }

    return answer;
}