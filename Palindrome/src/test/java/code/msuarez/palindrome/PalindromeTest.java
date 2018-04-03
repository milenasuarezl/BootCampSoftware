package code.msuarez.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void  aStringEmptyIsPalindrome() {
        assertThat(palindrome.isPalindrome(""), is(true));
    }

    @Test
    public void  aNullValueIsPalindrome() {
        assertThat(palindrome.isPalindrome(null), is(false));
    }

    @Test
    public void aOnlyLetterIsPalindrome() {
        assertThat(palindrome.isPalindrome("a"), is(true));
    }

    @Test
    public void abNoisPalindrome() {
        assertThat(palindrome.isPalindrome("ab"), is(false));
    }

    @Test
    public void abaIsPalindrome() {
        assertThat(palindrome.isPalindrome("aba"), is(true));
    }

    @Test
    public void readerNoIsPalindrome() {
        assertThat(palindrome.isPalindrome("reader"), is(false));
    }

    @Test
    public void radarIsPalindrome() {
        assertThat(palindrome.isPalindrome("radar"), is(true));
    }

    @Test
    public void aStringWithSpaceAlsoIsPalindrome() {
        assertThat(palindrome.isPalindrome("anita lava la tina"), is(true));
    }

    @Test
    public void aStringWithSpaceAndTypeNoLettersAlsoIsPalindrome() {
        assertThat(palindrome.isPalindrome("¡anita lava la tina!"), is(true));
    }

    @Test
    public void aStringSpecialCharacterssAlsoIsPalindrome() {
        assertThat(palindrome.isPalindrome("R@d@r"), is(true));
    }

    @Test
    public void aStringWithCapitalLettersAlsoIsPalindrome() {
        assertThat(palindrome.isPalindrome("RAdar"), is(true));
    }

    @Test
    public void aStringNumbersPalindrome() {
        assertThat(palindrome.isPalindrome("12321"), is(true));
    }

}
