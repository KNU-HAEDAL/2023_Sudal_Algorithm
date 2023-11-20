#include<iostream>
#include<string>
#include<queue>
using namespace std;
int main() 
{
	queue<int>x;
	int n;
	cin >> n;
	int num=0;
	string me;
	for (int i = 0; i < n; i++)
	{
		cin >> me;
		if (me == "push")
		{
			cin >> num;
			x.push(num);
		}
		if (me == "pop")
		{
			if (x.empty())
				cout << -1 << '\n';
			else
			{
				cout << x.front() << '\n';
				x.pop();
			}
		}

		if (me == "size")
			cout << x.size() << '\n';
		if (me == "empty")
			cout << x.empty() << '\n';
		if (me == "front")
		{
			if (x.empty())
				cout << -1 << '\n';
			else
				cout << x.front() << '\n';
		}

		if (me == "back")
		{
			if (x.empty())
				cout << -1 << '\n';
			else
				cout << x.back() << '\n';
		}

	}
}
