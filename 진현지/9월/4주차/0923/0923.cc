#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
bool bigger(pair<int, int>a, pair<int, int>b)
{
	if (a.second == b.second)
		return a.first < b.first;
	return a.second < b.second;
}
int main()
{
	vector<pair<int, int>>a;
	int n;
	cin >> n;
	int x=0;
	int y=0;
	for (int i = 0; i < n; i++)
	{
		cin >> x;
		cin >> y;

		a.push_back(make_pair(x,y));

	}
	sort(a.begin(), a.end(), bigger);

	for (int i = 0; i < n; i++)
		cout << a[i].first << " " << a[i].second << "\n";
}
