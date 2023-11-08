def solution(n, arr1, arr2):
    arr1_bin = []
    arr2_bin = []
    answer = []
    for i in range(n):
        arr1_bin.append(bin(arr1[i])[2:].zfill(n))  #2진법 변환
        arr2_bin.append(bin(arr2[i])[2:].zfill(n))  #앞자리 0으로 채우기
        a = ''
        for j in range(n):
            if arr1_bin[i][j]=='0' and arr2_bin[i][j]=='0':
                a += ' '
            else:
                a += '#'
        answer.append(a)
            
    return answer