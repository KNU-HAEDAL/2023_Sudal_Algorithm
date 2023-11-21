#include<iostream>
#include<queue>
using namespace std;

int main()
{
    queue<int> x;
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        x.push(i);
    }

    while (x.size() > 1)
    {
        x.pop();
        x.push(x.front());
        x.pop();
    }

    cout << x.front() << endl;

    return 0;
}
