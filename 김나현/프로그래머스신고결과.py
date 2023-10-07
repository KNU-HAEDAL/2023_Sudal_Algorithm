def solution(id_list, report, k):
    answer = [0 for _ in range(len(id_list))]
    inquire=[[] for _ in range(len(id_list))]
    stop=[0 for _ in range(len(id_list))]
    for i in range(len(report)):
        temp=report[i].split()
        idx=id_list.index(temp[0])
        print(temp)
        if temp[1] not in inquire[idx]:
            inquire[idx].append(temp[1])
            stop[id_list.index(temp[1])]+=1
    for i in range(len(id_list)):
        if stop[i]>=k:
            for j in range(len(inquire)):
                if id_list[i] in inquire[j]:
                    answer[j]+=1

    return answer
id=["muzi", "frodo", "apeach", "neo"]
repot=["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
print(solution(id,repot,2))