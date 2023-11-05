def solution(s):
    cnt1 = 0
    cnt2 = 0
    for i in s :
        if i == "P" or i == "p" :
            cnt1 += 1
        elif i == "y" or  i == 'Y' :
            cnt2 += 1
    
    if cnt1 == cnt2 :
        return True
    else :
        return False