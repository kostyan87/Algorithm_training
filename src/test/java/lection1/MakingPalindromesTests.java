package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingPalindromesTests {

    @Test
    public void oneLetterTest() {
        assertEquals(0, MakingPalindromes.getMinSum("a"));
    }

    @Test
    public void manyLetterTest() {
        assertEquals(1, MakingPalindromes.getMinSum("ab"));
        assertEquals(0, MakingPalindromes.getMinSum("aa"));
        assertEquals(0, MakingPalindromes.getMinSum("aaa"));
        assertEquals(0, MakingPalindromes.getMinSum("aba"));
        assertEquals(1, MakingPalindromes.getMinSum("abc"));
        assertEquals(1, MakingPalindromes.getMinSum("abbc"));
        assertEquals(4, MakingPalindromes.getMinSum("asvbrfrer"));
    }
}
