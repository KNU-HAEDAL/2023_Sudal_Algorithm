class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(k%2!=0){
                result[i]=arr[i]*k;
            }
            else{
                result[i]=arr[i]+k;
            }
        }
        return result;
    }
}