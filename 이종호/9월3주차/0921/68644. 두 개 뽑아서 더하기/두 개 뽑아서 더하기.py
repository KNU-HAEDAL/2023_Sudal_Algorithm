def solution(numbers):
    answer = list()
    for i in range(len(numbers)): # 모든 수 더하고 중복을 제거하자!
        for j in range(i+1, len(numbers)):
            if numbers[i] + numbers[j] not in answer:
                answer.append(numbers[i] + numbers[j])
    answer.sort()
    return answer