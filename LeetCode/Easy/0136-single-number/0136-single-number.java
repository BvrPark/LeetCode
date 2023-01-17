class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        int[] count = new int[60001];
        for(int i = 0; i < nums.length;i++){
            count[nums[i]+30000]++;
        }
        for(int i = 0; i < count.length;i++){
            if(count[i] == 1){
                answer = i;
                return answer-30000;
            }
        }
        
        return answer-30000;
        
        
    }
}