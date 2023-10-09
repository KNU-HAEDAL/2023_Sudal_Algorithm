def solution(s):
    if len(s) in [4,6]:
        if s.isdigit(): # isdigit을 통해서 숫자인지 판단해줌
            return True
    return False