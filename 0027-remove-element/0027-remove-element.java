class Solution {
    public int removeElement(int[] nums, int val) {
        int numOfElements = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                numOfElements++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == val && i <= numOfElements) {
                    var temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return numOfElements;
    }
}