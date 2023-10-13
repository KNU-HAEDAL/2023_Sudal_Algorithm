#include<iostream>
using namespace std;
int main()
{
	int n, k;
	cin >> n >> k;
	int z = 1;
	int answer1 = 1;
	int number = 1;
	for (int i = 1; i <= k; i++)
	{
		z=z* i;
	}
	for (int i = 1; i <= k; i++)
	{
		if (n == 1)
			break;
		else if (n>=2)
		{
		   number = n*number;
			n--;
			
		}
	}
	cout << number/z;
}
