package mediumTasks;

import dw.mediumTasks.LongestPalindromicSubstringSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringSolutionTest {

    LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
    String source, expectedResult;
    @Test
    void longestPalindrome() {
        long startTime = System.currentTimeMillis();
        String s = solution.longestPalindrome("qbmhukucteihghldwdobtvgwwnhflpceiwhbkmvxavmqxedfndegztlpjptpdowwavemasyrjxxnhldnloyizyxgqlhejsdylvkpdzllrzoywfkcamhljminikvwwvqlerdilrdgzifojjlgeayprejhaequyhcohoeonagsmfrqhfzllobwjhxdxzadwxiglvzwiqyzlnamqqsastxlojpcsleohgtcuzzrvwzqugyimaqtorkafyebrgmrfmczwiexdzcokbqymnzigifbqzvfzjcjuugdmvegnvkgbmdowpacyspszvgdapklrhlhcmwkwwqatfswmxyfnxkepdotnvwndjrcclvewomyniaefhhcqkefkyovqxyswqpnysafnydbiuanqphfhfbfovxuezlovokrsocdqrqfzbqhntjafzfjisexcdlnjbhwrvnyabjbshqsxnaxhvtmqlfgdumtpeqzyuvmbkvmmdtywquydontkugdayjqewcgtyajofmbpdmykqobcxgqivmpzmhhcqiyleqitojrrsknhwepoxawpsxcbtsvagybnghqnlpcxlnshihcjdjxxjjwyplnemojhodksckmqdvnzewhzzuswzctnlyvyttuhlreynuternbqonlsfuchxtsyhqlvifcxerzqepthwqrsftaquzuxwcmjjulvjrkatlfqshpyjsbaqwawgpabkkjrtchqmriykbdsxwnkpaktrvmxjtfhwpzmieuqevlodtroiulzgbocrtiuvpywtcxvajkpfmaqckgrcmofkxynjxgvxqvkmhdbvumdaprijkjxxvpqnxakiavuwnifvyfolwlekptxbnctjijppickuqhguvtoqfgepcufbiysfljgmfepwyaxusvnsratn");
        System.out.println(s + "\n" + (System.currentTimeMillis()-startTime) + " ms");

        source = "cbbd";
        expectedResult = "bb";
        System.out.println(expectedResult);
        assertEquals(expectedResult, solution.longestPalindrome(source));

        source = "ab";
        expectedResult = "b";
        System.out.println(expectedResult);
        assertEquals(expectedResult, solution.longestPalindrome(source));

        source = "babad";
        expectedResult = "bab";
        System.out.println(expectedResult);
        assertEquals(expectedResult, solution.longestPalindrome(source));

        source = "Makelele";
        expectedResult = "elele";
        System.out.println(expectedResult);
        assertEquals(expectedResult, solution.longestPalindrome(source));

        source = "Makelele4";
        expectedResult = "elele";
        System.out.println(expectedResult);
        assertEquals(expectedResult, solution.longestPalindrome(source));
    }
}