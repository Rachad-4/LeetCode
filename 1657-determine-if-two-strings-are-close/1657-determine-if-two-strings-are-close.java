class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1 == word2) return true;

        if (word1.length() != word2.length()) return false;

        HashSet word1Set = new HashSet();
        HashSet word2Set = new HashSet();

        for (int i = 0; i < word1.length(); i++) {
            word1Set.add(word1.charAt(i));
        }

        for (int i = 0; i < word2.length(); i++) {
            word2Set.add(word2.charAt(i));
        }

        ArrayList setList = new ArrayList<>(word1Set);
        ArrayList setList2 = new ArrayList<>(word2Set);

        for (int i = 0; i < setList2.size(); i++) {
            if (!word1Set.contains(setList2.get(i))) {
                return false;
            }
        }

        for (int i = 0; i < setList.size(); i++) {
            if (!word2Set.contains(setList.get(i))) {
                return false;
            }
        }

        ArrayList arrList = new ArrayList();
        ArrayList arrList2 = new ArrayList();
        int count = 1;
        char[] charArr = new char[word1.length()];
        char[] charArr2 = new char[word1.length()];

        for (int i = 0; i < word1.length(); i++) {
            charArr[i] = word1.charAt(i);
        }

        for (int i = 0; i < word2.length(); i++) {
            charArr2[i] = word2.charAt(i);
        }

        Arrays.sort(charArr);
        Arrays.sort(charArr2);

        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == charArr[i-1]) {
                count++;
            }
            else {
                arrList.add(count);
                count = 1;
            }
        }
        arrList.add(count);

        count = 1;

        for (int i = 1; i < charArr2.length; i++) {
            if (charArr2[i] == charArr2[i-1]) {
                count++;
            }
            else {
                arrList2.add(count);
                count = 1;
            }
        }
        arrList2.add(count);

        Collections.sort(arrList);
        Collections.sort(arrList2);

        if (!arrList.equals(arrList2)) return false;

        return true;
    }
}