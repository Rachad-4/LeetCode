class Solution {
    public int maxArea(int[] height) {
    if (height.length == 0) return 0;

    int area = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
        int currentArea = Math.min(height[left], height[right]) * (right - left);
        area = Math.max(area, currentArea);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return area;
    }
}