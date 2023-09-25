#include<iostream>
#include<string>
using namespace std;
int main()
{
	string n;
	cin >> n;
	int temp = 0;;
	for (int i = 0; i < n.size() - 1; i++)
	{
		for (int j = 0; j < n.size() - 1 - i; j++)
		{
			if (n[j] < n[j + 1])
			{
				temp = n[j];
				n[j] = n[j + 1];
				n[j+1] = temp;
			}
		}

	}
	for (int i = 0; i < n.size(); i++)
	{
		cout << n[i];
	}
}
