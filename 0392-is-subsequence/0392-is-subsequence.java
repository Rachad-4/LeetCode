class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        
        if (s.isEmpty()) return true;

        if (s.length() == t.length() && t.indexOf(s) < 0) return false;

        int index = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)) {
                index++;
                if (index == s.length()){
                    break;
                }
            }
        } return index == s.length();
    }
}