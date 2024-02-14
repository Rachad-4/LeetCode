class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        int max = 0;

        for (int i = 0; i < candies.length; i++){
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            arrayList.add((candies[i] + extraCandies) >= max);
        }
        return arrayList;   
    }
}