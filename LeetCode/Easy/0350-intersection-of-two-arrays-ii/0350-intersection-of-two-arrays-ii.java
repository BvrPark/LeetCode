class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        
        while((i < nums1.length) && (j < nums2.length)){
                if(nums1[i] == nums2[j]){
                    answer.add(nums1[i]);
                    i++;
                    j++;
                }else if(nums1[i] > nums2[j]){
                    j++;
                }else{
                    i++;
                }
            
        }
        
        int[] arr = new int[answer.size()];
        
        for(int k = 0; k < answer.size(); k++){
            arr[k] = answer.get(k);
        }
        
        return arr;
    }
}