#include<iostream>
#include<string>
using namespace std;
int main()
{
	string z;
	cin >> z;

	int result = 0;
	string num = "";
	bool minus = false;

	for (int i = 0; i <= z.size(); i++)
	{
		if (z[i] == '-' || z[i] == '+' || i == z.size())
		{
			if (minus)
			{
				result -= stoi(num);
				num = "";
			}
			else
			{
				result += stoi(num);
				num = "";
			}
		}
		else
		{
			num += z[i];
		}
		if (z[i] == '-')
			minus = true;
	}
	cout << result;
}
