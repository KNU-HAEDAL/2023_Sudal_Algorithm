n, jimin, hansu = map(int, input().split())
round = 1

while True:
    if abs(jimin-hansu) == 1 and (jimin//2 != hansu//2):
        break
    
    jimin = jimin - jimin//2
    hansu = hansu - hansu//2
    round += 1

print(round)