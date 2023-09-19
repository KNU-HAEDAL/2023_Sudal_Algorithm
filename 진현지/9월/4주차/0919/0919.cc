#include <iostream>
#include <string>
using namespace std;
int apart[15][15];
int main()
{
	int T;
	cin >> T;
	int k, n;
	while (T--)
	{
		cin >> k >> n;
		for (int i = 0; i <= k; i++)
		{
			for (int q = 1; q <= n; q++)
			{
				if (i == 0)
				{
					apart[0][q] = q;
				}
				else if (q == 1)
				{
					apart[i][1] = 1;
				}
				else
				{
					apart[i][q] = apart[i][q - 1] + apart[i - 1][q];
				}
			}
		
		}
		cout << apart[k][n] << endl;
	}
}
