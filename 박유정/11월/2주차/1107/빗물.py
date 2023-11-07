h, w = map(int,input().split())
block = list(map(int,input().split()))
water = 0

for i in range(1,w-1):
    left_max = max(block[:i])
    right_max = max(block[i+1:])
    LR_min = min(left_max, right_max)

    if block[i]<left_max and block[i]<right_max:
        water += LR_min - block[i]

print(water)