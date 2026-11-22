class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long result = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && result > 2147483648L) {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        return (int)(result * sign);
    }
}
