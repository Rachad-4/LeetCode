class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0;
        int totalSum = Arrays.stream(nums).sum() - nums[0];

        if (totalSum == 0) return 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                pivot = i;
                return pivot;
            }
        }
        return pivot;       
    }
}