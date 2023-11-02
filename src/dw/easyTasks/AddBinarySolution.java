package dw.easyTasks;
//Given two binary strings a and b, return their sum as a binary string.
//
//Example 1:
//Input: a = "11", b = "1"
//Output: "100"
//
//Example 2:
//Input: a = "1010", b = "1011"
//Output: "10101"
//
//Constraints:
//1 <= a.length, b.length <= 104
//a and b consist only of '0' or '1' characters.
//Each string does not contain leading zeros except for the zero itself.


public class AddBinarySolution {
    public String addBinary(String a, String b) {
        try {
            return Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
        } catch (NumberFormatException e) {
            char[] numberA = reverseBinaryNumber(a.toCharArray());
            char[] numberB = reverseBinaryNumber(b.toCharArray());
            int resultLen = Math.max(numberA.length, numberB.length);
            char[] resultDigits = new char[resultLen];

            int carry = 0;
            for (int i = 0; i < resultLen; i++) {
                //the below assigns 0 as in zero-padding i.e. 1101 + 111 -> 1101 + 0111
                int valueA = i >= numberA.length ? 0 : numberA[i] - '0';
                int valueB = i >= numberB.length ? 0 : numberB[i] - '0';
                int sum = valueA + valueB + carry;
                if (sum == 3) {
                    resultDigits[i] = '1';
                    carry = 1;
                } else if (sum == 2) {
                    resultDigits[i] = '0';
                    carry = 1;
                } else {
                    resultDigits[i] = (char) ('0' + sum);
                    carry = 0;
                }
            }
            resultDigits = reverseBinaryNumber(resultDigits);
            return (carry == 1) ? "1" + String.valueOf(resultDigits)
                    : String.valueOf(resultDigits);
        }
    }
    private char[] reverseBinaryNumber(char[] num){
        char[] reversed = new char[num.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = num[(num.length-1) - i];
        }
        return reversed;
    }
}







