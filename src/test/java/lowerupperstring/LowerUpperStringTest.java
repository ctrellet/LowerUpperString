package lowerupperstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple LetterCompress.
 */
public class LowerUpperStringTest {

    @Test
    public void getAlternateString_with_altERnaTIng_cAsE() {

        //Set
        LowerUpperString lust = new LowerUpperString();
        String input = "altERnaTIng cAsE";

        //Test
        String output = lust.getAlternateString(input);

        //Assert

        assertEquals("ALTerNAtiNG CaSe", output);
    }

}
