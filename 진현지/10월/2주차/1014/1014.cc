#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> jan = { 500,100,50,10,5,1 };
    int money, count = 0;
    cin >> money;
    money = 1000 - money;

    for (int i = 0; i < 6; i++) 
    {
        for (;;) {
            if (money >= jan[i]) {
                money -= jan[i];
                count++;
            }
            else break;
        }
    }
    cout << count;
}
