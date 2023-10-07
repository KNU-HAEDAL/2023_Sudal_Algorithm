class Solution {
    public String solution(int n) {
      String intToString=Integer.toString(n);
        int length=intToString.length();
        char[] arr=new char[length];
        int k=0;
        
        for(int i=0;i<intToString.length();i++){
            k=(int)Math.pow(10,length-i-1);
            arr[i]=(char)('0'+n/k);//
            n=n%k;
        }
        return new String(arr);
    }
}