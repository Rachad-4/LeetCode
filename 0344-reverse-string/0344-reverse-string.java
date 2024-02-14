class Solution {
    public void reverseString(char[] s) {
        char[] reverseString = new char[s.length];
        int j = 0;

        for (int i = s.length -1; i >= 0; i--){
            reverseString[j] = s[i];
            j++;
        }
        for (int i = 0; i < reverseString.length; i++){
            s[i] = reverseString[i];
        }System.out.println(s);
    }
}