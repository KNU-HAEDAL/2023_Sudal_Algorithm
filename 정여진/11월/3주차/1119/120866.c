#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// board_rows는 2차원 배열 board의 행 길이, board_cols는 2차원 배열 board의 열 길이입니다.
int solution(int** board, size_t board_rows, size_t board_cols) {
    int answer = 0;
     int data[board_rows+2][board_cols+2];
    memset(data,0,sizeof(data));
    for(int i=0;i<board_rows;i++)
    {
        for(int j=0;j<board_cols;j++)
        {
            if(board[i][j]==1)
            {
                data[i+1][j+1]=1;
                data[i+2][j+0]=1;
                data[i+2][j+1]=1;
                data[i+2][j+2]=1;
                data[i+0][j+0]=1;
                data[i+0][j+1]=1;
                data[i+0][j+2]=1;
                data[i+1][j+0]=1;
                data[i+1][j+2]=1;

            }
        }
    }
    for(int i=0;i<board_rows;i++)
    {
        for(int j=0;j<board_cols;j++)
        {
            if(data[i+1][j+1]==0) answer++;
        }
    }
    return answer;
}