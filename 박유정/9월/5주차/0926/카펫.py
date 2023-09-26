def solution(brown, yellow):
    answer = []
    total = brown*yellow
    
    for yellow_col in range(1,yellow+1):
        if yellow%yellow_col == 0:
            yellow_row = yellow//yellow_col
            if yellow_col*yellow_row == yellow and 2*(yellow_row+yellow_col)+4 == brown:
                answer.append(yellow_row+2)
                answer.append(yellow_col+2)
                break
    
    return answer