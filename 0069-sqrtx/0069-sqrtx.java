class Solution {
    public int mySqrt(int x) {
        int answer = 1;

        for (int i = 0; i <= x; i++){
            if (i * i > x){
                answer = i - 1;
                break;
            }
            else if (x == 0) {
                answer = x;
            }
            else if (x >= 2147395600){
                answer = 46340;
                break;
            }
        } return answer;
    }
}