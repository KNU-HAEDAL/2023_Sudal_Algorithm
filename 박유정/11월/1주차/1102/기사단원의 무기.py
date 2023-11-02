def solution(number, limit, power):
    a = []
    for i in range(1,number+1): #약수 개수 구하기
        count = 0
        for j in range(1,int(i**(1/2))+1):
            if i%j == 0:
                count += 1
                if j**2 != i:
                    count += 1
            if count>limit:
                count = power
                break
        a.append(count)
    
    return sum(a)