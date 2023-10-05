#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// weights_len은 배열 weights의 길이입니다.
long long solution(int weights[], size_t weights_len) {
    long long answer = 0;
    long long arr[100001]={0};
    long long ration_4=0;
    long long ration_3=0;

    for (int i=0; i<weights_len; i++)
    {
        arr[weights[i]]+=1;
    }
    
    for(int i=100; i<1001; i++)
    {
        if (arr[i]>=1)
        {
            ration_4=i*4;
            ration_3=i*3;
            if (arr[ration_4/3]>0 && ration_4%3==0 && ration_4/3<1001)
                answer+=(arr[i]*arr[ration_4/3]);
            if (arr[ration_4/2]>0 && ration_4%2==0 && ration_4/2<1001)
                answer+=(arr[i]*arr[ration_4/2]);
            if (arr[ration_3/2]>0 && ration_3%2==0 && ration_3/2<1001)
                answer+=(arr[i]*arr[ration_3/2]);
            if (arr[i]>1)
                answer+=((arr[i]*(arr[i]-1))/2);
        }
    }
    return answer;
}