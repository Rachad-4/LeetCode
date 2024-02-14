class Solution {
    public String reverseWords(String s) {
        String[] input = s.trim().split(" ");
        StringBuilder reversedString = new StringBuilder();
        
        for (int c = input.length - 1; c >= 0; c--) {
            if(input[c].trim().isEmpty() || input[c].trim().isBlank()) {
                continue;
            }
            reversedString.append(input[c]);
            if (c == 0) {
                continue;
            }
            reversedString.append(" ");
        }

        return reversedString.toString();
    }
}