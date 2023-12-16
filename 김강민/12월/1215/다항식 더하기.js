function solution(polynomial) {
    let answer = '';
    let terms = polynomial.split(/\s*([+-])\s*/);
    let strNum = 0;
    let num = 0;

    for (let term of terms) {
        if (term === 'x') {
            strNum += 1;
        } else if (term.includes('x')) {
            strNum += parseInt(term);
        } else if (term !== '' && term !== '+') {
            num += parseInt(term);
        }
    }

    if (strNum !== 0) {
        if (num === 0) {
            if (strNum === 1) {
                answer = 'x';
            } else {
                answer = strNum + 'x';
            }
        }

        if (num !== 0) {
            if (strNum === 1) {
                answer = 'x' + ' + ' + num;
            } else {
                answer = strNum + 'x' + ' + ' + num;
            }
        }
    }

    if (strNum === 0 && num !== 0) {
        answer = String(num);
    }

    return answer;
}
