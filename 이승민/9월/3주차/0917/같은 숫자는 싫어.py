def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in range(1, len(arr)):
        before = arr[i-1]
        if before != arr[i]:
            answer.append(arr[i])
    return answer
