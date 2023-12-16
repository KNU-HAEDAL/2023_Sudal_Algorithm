function solution(n) {
    let sum = 0;
    const remainder = n % 2;
    if (remainder !== 0) {
        for (let i = 1; i <= n; i += 2) {
            sum += i;
        }
    }

    if (remainder === 0) {
        for (let i = 2; i <= n; i += 2) {
            sum += Math.pow(i, 2);
        }
    }

    return sum;
}
