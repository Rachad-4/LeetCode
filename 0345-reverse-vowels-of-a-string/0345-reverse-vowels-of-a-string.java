class Solution {
    public String reverseVowels(String s) {
        StringBuilder reversedVowels = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                reversedVowels.append(c);
                arrayList.add(i);
            }
        }
        Collections.sort(arrayList);

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index < arrayList.size() && i == arrayList.get(index)) {
                answer.append(reversedVowels.charAt(index++));
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
