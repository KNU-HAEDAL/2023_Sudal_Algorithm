def solution(sizes):
    answer = 0
    maxv, maxh = 0, 0
    for i in sizes:
        if i[0] < i[1]:
            i[0], i[1] = i[1], i[0]
    for j in sizes:
        if maxv < j[0]:
            maxv = j[0]
        if maxh < j[1]:
            maxh = j[1]
    return maxv * maxh
