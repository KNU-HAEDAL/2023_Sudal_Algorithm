N = int(input())
slime = list(map(int, input().split()))
slime.sort(reverse=True) # 3 2 1
score = 0
for i in range(N-1):
    score += slime[i]*slime[i+1] #6
    slime[i+1] = slime[i]+slime[i+1] #slime[1] = 3+2
print(score)