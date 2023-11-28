#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// dots_rows는 2차원 배열 dots의 행 길이, dots_cols는 2차원 배열 dots의 열 길이입니다.
int solution(int** dots, size_t dots_rows, size_t dots_cols) {
    int answer = 0;
    float ck1,ck2;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            if(j==i) continue;
            ck1=(float)(dots[i][1]-dots[j][1])/(dots[i][0]-dots[j][0]);
            for(int k=0;k<4;k++)
            {
                for(int l=0;l<4;l++)
                {
                    if((i==k && j==l) || (i==l && j==k )) continue;
                    if(k==l) continue;
                    ck2=(float)(dots[k][1]-dots[l][1])/(dots[k][0]-dots[l][0]);
                    if(ck1==ck2) 
                    {
                     //   printf("i=%d,j=%d,k=%d,l=%d\n",i,j,k,l);
                     //   printf("[%d-%d]/[%d-%d]\n",dots[i][1],dots[j][1],dots[i][0],dots[j][0]);
                      //  printf("%f_%f\n",ck1,ck2);
                        return 1;
                    }
                }
            }
        }
    }
    return answer;
}
