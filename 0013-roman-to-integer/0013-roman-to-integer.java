class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length() ; i++){
            if (i != 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I'){
                total -= 1;
                total += 4;
            }
            else if (i != 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I'){
                total -= 1;
                total += 9;
            }
            else if (i != 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X'){
                total -= 10;
                total += 40;
            }
            else if (i != 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X'){
                total -= 10;
                total += 90;
            }
            else if (i != 0 && s.charAt(i) == 'D' && s.charAt(i - 1 ) == 'C'){
                total -= 100;
                total += 400;
            }
            else if (i != 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C'){
                total -= 100;
                total += 900;
            }
            else if (s.charAt(i) == 'I'){
                total += 1;
            }
            else if (s.charAt(i) == 'V'){
                total += 5;
            }
            else if (s.charAt(i) == 'X'){
                total += 10;
            }
            else if (s.charAt(i) == 'L'){
                total += 50;
            }
            else if (s.charAt(i) == 'C'){
                total += 100;
            }
            else if (s.charAt(i) == 'D'){
                total += 500;
            }
            else if (s.charAt(i) == 'M'){
                total += 1000;
            }
        } return total;
    }
}