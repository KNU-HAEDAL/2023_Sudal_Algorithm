function solution(s){
    var answer = true;
    var l1 = []
    for (var i=0; i<s.length; i++){
        if (s[i]=='('){
            l1.push(s[i])
        }
        else{
            if (l1.length!=0){
                l1.pop()
            }
            else{
                answer=false;
                break;
            }
        }
    }
    if (l1.length!=0){
        answer=false;
    }
    return answer;
}