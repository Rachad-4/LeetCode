class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet numSet = new HashSet();
        int count = 1;

        if (arr.length == 2 && arr[0] != arr[1]) return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }
            else {
                if (numSet.contains(count)) return false;
                numSet.add(count);
                count = 1;
            }
        }

        if (numSet.contains(count)) return false;

        return true;
    }
}