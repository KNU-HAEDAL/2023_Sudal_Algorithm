def solution(numbers):
    answer = []
    for i in range(len(numbers)-1):
        for j in range(i+1,len(numbers)):
            sum = numbers[i]+numbers[j]
            answer.append(sum)
            
    answer = list(set(answer))
    answer.sort()
    
    return answer