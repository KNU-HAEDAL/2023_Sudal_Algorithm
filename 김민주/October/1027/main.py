def solution(my_string, num1, num2):
    cnt = 0
    answer = ''
    answer2 = '' #num1의 인덱스
    answer3 = '' #num1과 num2의 중간 인덱스
    answer4 = '' #num2 뒤 인덱스
    num1 = min(num1,num2)
    num2 = max(num1,num2)
    for i in my_string:
        if cnt < num1:
            answer += i
        elif cnt == num1:
            answer2 += i
        elif cnt < num2:
            answer3 += i
        elif cnt == num2:
            answer += i
        else:
            answer4 += i
        cnt += 1
    answer += answer3
    answer += answer2
    answer += answer4
    
    return answer