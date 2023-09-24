#include<iostream>
using namespace std;

int main() {
    int a, b, c, d, e, f;
    cin >> a >> b >> c >> d >> e >> f;

    int x, y;
    int answera = 0, answerb = 0;
    
    for (x = -999; x <= 999; x++) 
    {
        for (y = -999; y <= 999; y++) 
        {
            if (x * a + y * b == c && x * d + y * e == f) 
            {
                answera = x;
                answerb = y;
                break;
            }
        }
    }

    cout << answera << " " << answerb;
    return 0;
}
