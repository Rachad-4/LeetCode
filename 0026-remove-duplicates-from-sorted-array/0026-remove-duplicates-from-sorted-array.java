class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        
        int currentNumber = nums[0];
        int currentNumberIndex = 0;
        int uniqueNumber = 1;

        for (int i = 1; i < nums.length; i++) {
            if (currentNumber != nums[i]) {
                nums[++currentNumberIndex] = nums[i];
                currentNumber = nums[i];
                uniqueNumber++;
            }
        }
        
        return uniqueNumber;
        
    }
}