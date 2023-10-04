#include<iostream>
using namespace std;
int main()
{
	int k;
	cin >> k;
	int* nums = new int[k];

	int sum = 0;
	int top = -1;
	for (int i = 0; i < k; i++)
	{
		int z;
		cin >> z;
		if (z == 0)
		{
			sum -= nums[top];
			top--;
		}
		else
		{
			top++;
			nums[top] = z;
			sum += z;
		}
	}
	cout << sum;

	delete[] nums;

	return 0;
}
