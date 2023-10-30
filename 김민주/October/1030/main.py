def solution(age):
    answer = ''
    for i in str(age):
        answer += chr(int(i)+97)
#a 의 아스키코드가 97
    return answer