class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0,0}; 
        short secondNumber = 1;

        for (short i = 0; i < nums.length + 1; i++) {
            if (i == nums.length){
                i = 0;
            }
            if (secondNumber >= nums.length){
                secondNumber = 1;
            }
            if (nums[i] + nums[secondNumber] != target){
                secondNumber++;
            }    
            else if (nums[i] + nums[secondNumber] == target){
                answer[0] = i;
                answer[1] = secondNumber;
                break;
            }    
        }return answer;
    }
}