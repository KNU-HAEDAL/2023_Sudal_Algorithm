def solution(s, n):
    answer = ''
    
    for i in s:
        if i == ' ':          #공백이면 걍 추가하고 넘어감
            answer += ' '
            continue
            
        temp = ord(i) + n     #아스키코드화하여 n만큼 밀어준것
                              #ord는 문자를 아스키코드화한 것
        
        if 65 <= ord(i) <= 90:  #대문자인데
            if temp > 90:       # Z 넘어갔으면
                answer += chr(temp-26)  
            else:
                answer += chr(temp)
                
        elif 97 <= ord(i) <= 122:   #소문자인데
            if temp > 122:          # z 넘어갔으면
                answer += chr(temp-26)
            else:
                answer += chr(temp)
    
    return answer