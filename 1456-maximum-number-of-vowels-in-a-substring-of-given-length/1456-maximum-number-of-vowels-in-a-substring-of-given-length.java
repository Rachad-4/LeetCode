class Solution {
    public int maxVowels(String s, int k) {
    int vowelCount = 0;
    int maxVowelCount = 0;

    // Count vowels in the first window of length k
    for (int i = 0; i < k; i++) {
        char c = s.charAt(i);
        if (isVowel(c)) {
            vowelCount++;
        }
    }
    maxVowelCount = vowelCount;

    // Slide the window and update vowel count
    for (int i = k; i < s.length(); i++) {
        char prevChar = s.charAt(i - k);
        char currChar = s.charAt(i);

        if (isVowel(currChar)) {
            vowelCount++;
        }
        if (isVowel(prevChar)) {
            vowelCount--;
        }
        
        maxVowelCount = Math.max(maxVowelCount, vowelCount);
    }

    return maxVowelCount;
}

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}