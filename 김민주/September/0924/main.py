def solution(my_string):
    mo = ['a','e','i','o','u']
    answer = ''
    for i in my_string:
        if i not in mo:
            answer += i
    return answer