function solution(number, k) {
    var stack = [];

    for (const s of number){
        while (k != 0 && stack[stack.length - 1] < s){
            stack.pop();
            k--;
        }
        stack.push(s)
    }

    while (k != 0){ // 98765 같은 경우
        stack.pop();
        k--;
    }

    return stack.join('');
}