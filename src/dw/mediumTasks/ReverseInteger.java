package dw.mediumTasks;
/*
TASK 8 (medium)

Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Constraints:
-2^31 <= x <= 2^31 - 1
*/
public class ReverseInteger {
    public int solution(int x) {
        //I'm sure it's not the best solution, I just found this the most intuitive, easy to write, read and understand

        String xAsStr = String.valueOf(x);
        StringBuilder reversed = new StringBuilder();
        for (int i = xAsStr.length() - 1; i >= 0; i--) {
            //let's ignore the minus sign for now
            if (i == 0 && xAsStr.charAt(i) == '-') {
                break;
            }
            reversed.append(xAsStr.charAt(i));
        }
        //here let's sanitize the number so that it doesn't have leading zeros
        int i = 0;
        while (i < reversed.length()) {
            if (reversed.charAt(i) != '0') {
                break;
            } else {
                reversed.deleteCharAt(i);
                i--;
            }
            i++;
        }
        //let's add the minus sign at the beginning if the number is negative
        if (x < 0) {
            reversed.insert(0, '-');
        }
        //the below makes sure that the condition set by the second sentence in the task description is met
        //that is, it makes sure 0 is returned if parsing reversed number to an int would end up with an overflow
        int y = 0;
        try {
            y = Integer.parseInt(reversed.toString());
        } catch (Exception ignored) {}
        return y;
    }
}




















