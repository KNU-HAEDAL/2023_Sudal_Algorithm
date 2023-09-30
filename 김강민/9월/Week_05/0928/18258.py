import sys
from collections import deque
input = sys.stdin.readline
que = deque([])

N = int(input())

for i in range(N):
    command = list(input().split())
    if command[0] == 'push':
        que.append(command[1])
    
    # pop
    elif command[0] == "pop":
        if len(que) == 0:
            print(-1)
        else:
            print(que.popleft())
    
    # size
    elif command[0] == "size":
        print(len(que))
    
    # empty
    elif command[0] == "empty":
        print(1 if len(que) == 0 else 0)
    
    # front
    elif command[0] == "front":
        if len(que) == 0:
            print(-1)
        else:
            print(que[0])

    # back
    elif command[0] == "back":
        if len(que) == 0:
            print(-1)
        else:
            print(que[-1])