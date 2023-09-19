def solution(sides):
    c = max(sides)
    sum = sides[0]+sides[1]+sides[2]-c
    if c < sum:
        return 1
    else:
        return 2