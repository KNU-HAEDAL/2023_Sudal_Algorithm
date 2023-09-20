def solution(phone_number):
    answer = ''
    show_num = phone_number[-4:]  # 슬라이싱을 통해서 나중에 붙이기 위해 뒤에 4번째부터 끝까지
    for i in range(len(phone_number)-4):
        answer += "*" # append 를 사용하면 리스트 형태로 붙여넣기 떄문에 불가능
    answer += show_num # 문자열 붙이기
    return answer