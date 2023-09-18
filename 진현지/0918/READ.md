# 9월18일

-----------

- 9월 18일

>백준[2750] 버블정렬 문제

<https://www.acmicpc.net/problem/2750>

[참고자료] (https://khu98.tistory.com/106)

```cpp
#include <iostream>
#include<string>
using namespace std;
int main()
{
	int n;
	cin >> n;
	int z;
	int arr[1000];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	for (int i = n; i > 1; i--)
	{
		for (int j = 0; j + 1 < i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				z = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = z;

			}
		}


	}
	for (int i = 0; i < n; i++)
		cout << arr[i] << endl;
}
```
