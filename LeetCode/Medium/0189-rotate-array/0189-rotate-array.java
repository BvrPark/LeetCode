class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++){
            answer[(i+k)%len] = nums[i];
        }
        for(int i = 0; i < len; i++){
            nums[i] = answer[i];
        }
       
    }
}