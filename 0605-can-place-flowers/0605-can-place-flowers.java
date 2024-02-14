class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int plantsPlaced = 0;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed.length < 2) {
                if (flowerbed[i] == 0 && n <= 1) {
                    return true; 
                }
            }
            if (flowerbed.length > 1) {
                if (i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                    flowerbed[i] = 1;
                    plantsPlaced++;
                } else if (i > 0 && i < flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        plantsPlaced++;
                    }
                } else if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    plantsPlaced++;
                }
            }
        }
        return n <= plantsPlaced;
    }
}