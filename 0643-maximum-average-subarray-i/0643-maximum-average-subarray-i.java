class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double maxAverage = 0;

    if (k == 1) {
        maxAverage = Arrays.stream(nums).max().getAsInt();
    } 
    else {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAverage = (double) sum / k;
        
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            double average = (double) sum / k;
            if (average > maxAverage) {
                maxAverage = average;
            }
        }
    }
    return maxAverage;
    }
}