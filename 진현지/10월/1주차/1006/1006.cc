#include<iostream>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    if (n == 0) 
    {
        cout << "0" << endl;
        return 0;
    } else if (n == 1) 
    {
        cout << "1" << endl;
        return 0;
    }

    int* nums = new int[n + 1];
    nums[0] = 0;
    nums[1] = 1;

    for (int i = 2; i <= n; i++) 
    {
        nums[i] = nums[i - 1] + nums[i - 2];
    }

    cout << nums[n] << endl;

    delete[] nums;
    return 0;
}
