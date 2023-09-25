#include<iostream>
#include<algorithm>
#include<vector>
#include<string>
using namespace std;



int main()
{
	int n;
	cin >> n;
	int num = 665;
	int tmp = 0;
	while (1)
	{
		num++;
		int aaa = num;
		while (aaa >= 666)
		{
			if (aaa % 1000 == 666)
			{
				tmp++;
				break;
			}
			aaa /= 10;
		}
		if (tmp == n)
		{
			cout << num;
			break;
		}
	}
	
}
