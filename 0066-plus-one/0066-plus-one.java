class Solution {
    public int[] plusOne(int[] digits) {
        String strDigitFrontPortion = "";
        String strDigits = "";
        int allNines = 0;
        int[] addOneToAllNine = new int[1 + digits.length];


        for (int i = 0; i < digits.length; i++){
            if (allNines == 1){
                addOneToAllNine[0] = 1;
                return addOneToAllNine;
            }
            for (int j = i + 1; j < digits.length; j++){
                if (digits[i] == 9 && digits[j] == 9){
                    allNines = 1;
                }
                else {
                    allNines = 0;
                    break;
                }
            }
            if (allNines == 0){
                break;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            if(digits.length > 18 && i < digits.length - 17){
                strDigitFrontPortion += String.valueOf(digits[i]);
            }
            else
            strDigits += String.valueOf(digits[i]);
        }

        for (int i = 0; i < strDigits.length(); i++){
            if (strDigits.length() == 1)
                break;

            else if (strDigits.charAt(i) == '0'){
                strDigitFrontPortion += "0";
            }
            else
                break;
        }
        
        long intDigits = Long.parseLong(strDigits) + 1;
        String totalString = strDigitFrontPortion + String.valueOf(intDigits);
        String updatedStrDigits = String.valueOf(totalString);

        int[] newDigits = new int[updatedStrDigits.length()];

        for (int i = 0; i < updatedStrDigits.length(); i++) {
            newDigits[i] = Integer.parseInt(String.valueOf(updatedStrDigits.charAt(i)));
        }
        return newDigits;
    }
}