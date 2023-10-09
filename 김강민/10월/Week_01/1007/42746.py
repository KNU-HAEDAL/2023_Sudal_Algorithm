def solution(numbers):
    num = [str(i) for i in numbers]
    num = sorted(num, key = lambda x: x*3, reverse = True)
    return str(int(''.join(num)))


print(solution([6, 10, 2]))