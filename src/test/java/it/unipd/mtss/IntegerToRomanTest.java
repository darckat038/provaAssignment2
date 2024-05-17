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
    public void testLimiti() {
        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(-1));
        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(24));
    }
}
