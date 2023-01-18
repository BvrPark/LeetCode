class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] >= 0 && nums1[i] >= 0){
                    if(nums1[i] == nums2[j]){
                        answer.add(nums1[i]);
                        nums1[i] = -1;
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        }
        
        int[] arr = new int[answer.size()];
        
        for(int k = 0; k < answer.size(); k++){
            arr[k] = answer.get(k);
        }
        
        return arr;
    }
}