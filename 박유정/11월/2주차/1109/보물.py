N = int(input())
A = list(map(int, input().split()))  # 1 1 1 6 0
B = list(map(int, input().split()))  # 2 7 8 3 1
sum = 0

for _ in range(N):
    max_B = max(B)
    min_A = min(A)
    sum += max_B * min_A
    B.remove(max_B)
    A.remove(min_A)

print(sum)