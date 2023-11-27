def solution(before, after):
    answer = 0
    for i in before:
        if before.count(i)!=after.count(i):
            answer += 1
    if answer == 0:
        return 1
    else:
        return 0