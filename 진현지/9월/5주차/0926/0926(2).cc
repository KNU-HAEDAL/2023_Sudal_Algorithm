#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	string x;
	cin >> x;

	bool aa = next_permutation(x.begin(), x.end());
	//prev_permutation도 있다고 한다!

	if (aa)
		cout << x;
	else
		cout << 0;

}
