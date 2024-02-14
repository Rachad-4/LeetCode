class Solution {
    public int largestAltitude(int[] gain) {
        int gainedAltitude = 0 + gain[0];
        int largestAltitude = Math.max(0,gainedAltitude);

        for (int i = 1; i <= gain.length - 1; i++) {
            gainedAltitude += gain[i];
            largestAltitude = Math.max(largestAltitude,gainedAltitude);
        }
        return largestAltitude;
    }
}