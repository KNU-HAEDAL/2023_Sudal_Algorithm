class Solution {
    public int[] solution(int[] num_list, int n) {
        int[]result=new int[n];
        int k=0;
        
        for(int i=0;i<n;i++){
            result[k]=num_list[i];
            k++;
        }
        return result;
    }
}