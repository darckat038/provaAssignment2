////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testPrimi3() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testPrimi6() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    // --- PRIMI 10 NUMERI ---
    //7 - 8 - 9 - 10
    @Test
    public void testPrimi10() {
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    // --- PRIMI 20 NUMERI ---
    //11 - 14  - 17   - 19  - 20
    //XI - XIV - XVII - XIX - XX
    @Test
    public void testPrimi20() {
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testPrimi50() {
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXVII", IntegerToRoman.convert(27));
        assertEquals("XXXII", IntegerToRoman.convert(32));
        assertEquals("XXXIX", IntegerToRoman.convert(39));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
    }

    // --- PRIMI 100 NUMERI ---
    //52  - 54  - 57  - 63    - 65  - 80   -  88      - 91  - 99   - 100
    //LII - LIV - LVII - LXIII - LXV - LXXX - LXXXVIII - XCI - XCIX - C
    @Test
    public void testPrimi100() {
        assertEquals("LII", IntegerToRoman.convert(52));
        assertEquals("LIV", IntegerToRoman.convert(54));
        assertEquals("LVII", IntegerToRoman.convert(57));
        assertEquals("LXIII", IntegerToRoman.convert(63));
        assertEquals("LXV", IntegerToRoman.convert(65));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("LXXXVIII", IntegerToRoman.convert(88));
        assertEquals("XCI", IntegerToRoman.convert(91));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testLimiti() {
        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(-1));
        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(142));
    }
}
