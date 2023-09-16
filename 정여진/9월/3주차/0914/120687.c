#include <string>
#include <vector>
 
using namespace std;
 
int solution(vector<vector<int>> lines) {
    int answer = 0;
    
    // 좌표를 여유롭게 300까지 주었다.
    vector<int> vec (300, 0);
    
    for(int i = 0; i < lines.size(); i++)
    {
        int a = lines[i][0];
        int b = lines[i][1];
        // a는 넘어가고 b는 확실하게 체크해준다.
        for(int j = a + 101; j < b + 101; j++)
        {
            vec[j]++;
        }
    }
    
    // 두 개 이상의 선분이 겹치는 부분의 길이 구하기
    for(int i = 0; i < vec.size(); i++)
    {  
        if (vec[i] > 1) answer++;
    }
    
    return answer;
}
