class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int majorityElement = nums[0];
        int maxOccur = 0;
        int occur = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                occur++;
            } else if (nums[i] != nums[i-1]){
                if (maxOccur == 0) {
                    maxOccur = occur;
                    occur = 1;
                } else if (maxOccur < occur) {
                    majorityElement = nums[i-1];
                    maxOccur = occur;
                    occur = 1;
                }
            }
        }

        if (maxOccur < occur){
            majorityElement = nums[nums.length-1];
        }

        return majorityElement;
    }
}