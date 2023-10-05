import sys
input = sys.stdin.readline

n = int(input())

stk = []
start = 1
ans = []

for _ in range(n):
    num = int(input())

    while start <= num:
        stk.append(start)
        ans.append('+')
        start += 1

    if stk[-1] == num:
        stk.pop()
        ans.append('-')

    else:
        print('NO')
        break
else:
    for i in ans:
        print(i)