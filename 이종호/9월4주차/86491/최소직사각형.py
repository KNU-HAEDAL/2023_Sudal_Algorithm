def solution(sizes):
    answer = 0
    ga = 0 # 가로길이
    sae = 0 # 세로길이
    
    for arr in sizes :
        arr = sorted(arr, reverse = True) # 각 행을 큰 값으로 정렬
        if ga < arr[0] : 
            ga = arr[0]
        if sae < arr[1] :
            sae = arr[1]
            
    answer = ga * sae
    
    return answer