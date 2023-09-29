import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
deque = deque([i for i in range(1, N + 1)])
discard = []

while(len(deque) > 1):
    discard.append(deque.popleft())
    deque.append(deque.popleft())

for i in discard:
    print(i, end=' ')

print(deque[0])