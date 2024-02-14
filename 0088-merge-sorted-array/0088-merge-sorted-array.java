class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList mergedLists = new ArrayList();
        int[] mergedArr = new int[m + n];
        int index = 0;

        for (int i = 0; i < m; i++){
            mergedLists.add(nums1[i]);
        }
        for (int i = m; i < m + n; i++) {
            mergedLists.add(nums2[index]);
            index++;
        }
        Collections.sort(mergedLists);
        for (int i = 0; i < mergedArr.length; i++) {
            nums1[i] = (int) mergedLists.get(i);
        }
    }
}