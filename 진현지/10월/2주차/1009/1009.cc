#include<iostream>
using namespace std;
int main()
{
	int n;
	cin >> n;
	long int k = 1;
	for (int i = 1; i <= n; i++)
	{
		k = k * i;
	}
	cout << k;
}
