def solution(s):
    answer = []
    words = s.split(" ") # 공백 단위로 끊음
    for word in words:
        w = "" # 새로운 문자열 생성
        for i in range(len(word)):
            if i % 2:
                w += word[i].lower()
            else:
                w += word[i].upper()
        answer.append(w)
    return ' '.join(answer)