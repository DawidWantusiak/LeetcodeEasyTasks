package dw.easyTasks;/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Constraints:
1 <= columnNumber <= 231 - 1
*/

public class ExcelSheetColumnTitleSolution {
    public String convertToTitle(int columnNumber) {
        //Create a StringBuilder to store the column title
        StringBuilder columnName = new StringBuilder();
        //Initialize the quotient to the input column number
        int quotient = columnNumber;
        //Continue until the quotient is zero
        while (quotient > 0){
            //Calculate the remainder using (quotient - 1) so that we handle the case when quotient is exactly 26
            //For example, if columnNumber is 26, the remainder should be 25 and the quotient should be 0.
            //By subtracting 1 from the quotient, we get 25 % 26 = 25 as the remainder and 25 / 26 = 0 as the quotient.
            int remainder = (quotient - 1) % 26;
            //Insert the character corresponding to the remainder at the beginning of the StringBuilder
            //We add 'A' to the remainder to convert it to the corresponding character.
            //For example, if the remainder is 0, we add 'A' to get 'A'. If the remainder is 1, we add 'A' to get 'B', and so on.
            //We insert the character at the beginning of the StringBuilder so that the final result is in the correct order.
            columnName.insert(0, (char)(remainder + 'A'));
            //Calculate the new quotient for the next iteration
            //We subtract 1 from the quotient so that we handle the case when the remainder is 0 and the quotient is exactly 26.
            //For example, if columnNumber is 52, the first digit should be 'B' (remainder 1) and the second digit should be 'Z' (remainder 0, quotient 1).
            //By subtracting 1 from the quotient, we get (52 - 1) / 26 = 1 as the new quotient for the next iteration.
            quotient = (quotient - 1) / 26;
        }
        return columnName.toString();
    }
}












