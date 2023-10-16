def solution(s):
    answer = ''
    s_spl = s.split(' ')

    for i in s_spl:
        for j in range(len(i)):
            if j % 2 == 0:
                answer += i[j].upper()
            else:
                answer += i[j].lower()
        answer += ' '
    return answer[0:-1]