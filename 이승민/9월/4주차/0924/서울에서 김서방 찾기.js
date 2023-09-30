function solution(seoul) {
    var answer = '';
    var cnt = 0;
    for (var i=0; i<seoul.length; i++) {
        if (seoul[i]=='Kim') {
            answer='김서방은 '+cnt+'에 있다'
        }
        cnt++;
    }
    return answer;
}