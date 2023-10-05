class Solution {
    public String solution(String my_string, String alp) {
        // 문자열 my_string을 대문자로 변경하고 반환
        String result = my_string.replace(alp, alp.toUpperCase());
        return result;
    }
}