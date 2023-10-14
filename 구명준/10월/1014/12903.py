def solution(s):
    answer = ''
    if len(s) % 2 !=0:
        d = s[int(len(s)/2)]     
        answer = d
    else:
        d = s[int(len(s)/2)-1:int(len(s)/2)+1]
        answer = d
    return answer