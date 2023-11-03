N = int(input())
N_list = list(map(int, input().split()))
N_list.sort(reverse=True)
answer = 0
for i in range(N-1): #9 7 5 3 1
    answer += N_list[i] - N_list[i+1]
answer += N_list[0] - N_list[-1]
print(answer)