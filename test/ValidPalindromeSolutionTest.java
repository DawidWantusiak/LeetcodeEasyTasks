import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeSolutionTest {

    ValidPalindromeSolution solution = new ValidPalindromeSolution();
    @Test
    void isPalindrome() {
        long startTime = System.currentTimeMillis();

        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(System.currentTimeMillis()-startTime);

        startTime = System.currentTimeMillis();
        assertTrue(solution.isPalindrome(" "));
        System.out.println(System.currentTimeMillis()-startTime);

        startTime = System.currentTimeMillis();
        assertFalse(solution.isPalindrome("race a car"));
        System.out.println(System.currentTimeMillis()-startTime);
    }
}