class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        
        digits[digits.length-1]++;
        
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] > 9){
                digits[i] = digits[i] % 10;
                if(i > 0){
                    digits[i-1]++;
                    stack.add(digits[i]);
                }else{
                    stack.add(digits[i]);
                    stack.add(1);
                }
            }else{
                stack.add(digits[i]);
            }
            
        }
        
        int[] answer = new int[stack.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = stack.pop();
        }
        
        return answer;
    }
}