class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        
        if (n < 3) {
            return false;
        }
        
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }
        
        return false;
    }
}