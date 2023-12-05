def solution(babbling):
    cnt = 0
    
    for babble in babbling:
        while babble:
            if babble[:3] in ['aya', 'woo']:
                babble = babble[3:]
            elif babble[:2] in ['ye', 'ma']:
                babble = babble[2:]
            else:
                break
        if babble == '':
            cnt += 1
                
    return cnt