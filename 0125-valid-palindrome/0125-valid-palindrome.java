class Solution {
    public boolean isPalindrome(String s) {
        
        String lowerCaseS = s.toLowerCase().trim();
        int j = lowerCaseS.length() -1;

        for (int i = 0; i < lowerCaseS.length(); i++) {
            if (!Character.isLetter(lowerCaseS.charAt(i)) && !Character.isDigit(lowerCaseS.charAt(i))){
                continue; //Skips "i" and skips the remaining code if "i" is not an alphanumeric value
            }

            while(!Character.isLetter(lowerCaseS.charAt(j)) && !Character.isDigit(lowerCaseS.charAt(j))) {
                    j--; //Reduces "j" until it is an alphanumeric value
                }

            if (lowerCaseS.charAt(i) != lowerCaseS.charAt(j)){
                return false; //returns false if values do not match
            }
            j--;
        }
        return true;
    }
}