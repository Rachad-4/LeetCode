class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int replacementIndex = 0;
        int uniqueNumbers = 1;


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]){
                 nums[++replacementIndex] = nums[i + 1];
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i -1]) {
                break;
            }
            else
            uniqueNumbers++;
        }

        return uniqueNumbers;
    }    
}
