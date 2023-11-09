#include<iostream>
using namespace std;
int main()
{
	int k[10] = { 0 };
	int n = 0;
	int sum = 0;
	int count = 0;
	int countList[10] = { 0 };
	int maxCount = 0;
	int max;
	pair<int, int>res;
	for (int i = 0; i < 10; i++)
	{
		cin >> n;
		k[i] = n;
		sum += n;
		
	}

	for (int i = 0; i < 10; i++) 
	{
		for (int j = 0; j < 10; j++) 
		{
			if (k[i] == k[j])
			{
				countList[i] ++;
			}
		}
	}

	for (int i = 0; i < 10; i++) 
	{
		if (countList[i] > maxCount) 
		{
			max = k[i];
			maxCount = countList[i];
		}
	}

	cout << sum / 10 << '\n' << max;
}
