class Solution {
    public int kthFactor(int n, int k) {
        ArrayList arrList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrList.add(i);
            }
        }
        if (arrList.size() < k){
            return -1;
        }
        else {
            int kth = (int) (arrList.get(k - 1));
            return kth;
        }
    }    
}