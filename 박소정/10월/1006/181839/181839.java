class Solution {
    public int solution(int a, int b) {
        int result=0;
        if(a%2!=0||b%2!=0){
            if(a%2!=0&&b%2!=0){
         result=(int)Math.pow(a,2)+(int)Math.pow(b,2);
      }
            else{
                result=2*(a+b);
            }
        }
        else{
            result=(a>b)?(a-b):(b-a);
        }
        return result;
    }
}