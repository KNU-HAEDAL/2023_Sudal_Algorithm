def solution(sizes):
    w = []
    h = []
    
    for size in sizes:
        size.sort(reverse=True)
        
        w.append(size[0])
        h.append(size[1])
        
    return max(w) * max(h)