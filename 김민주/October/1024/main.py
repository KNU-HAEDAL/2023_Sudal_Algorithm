def solution(my_string):
    answer = []
    for i in my_string:
        if "0"<=i<="9":
            answer += i
    answer = list(map(int, answer))
    return sorted(answer)