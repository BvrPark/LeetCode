import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] answer = new int[2];

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                sum = 0;
                sum = nums[i] + nums[j];
                if(target == sum){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return answer;
    }
}