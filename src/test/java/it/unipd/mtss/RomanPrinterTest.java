////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrimi3() {
        String v_1 = "  _____  \n" +
        " |_   _| \n" +
        "   | |   \n" +
        "   | |   \n" +
        "  _| |_  \n" +
        " |_____| \n";

        String v_2 = "  _____    _____  \n" + 
        " |_   _|  |_   _| \n" + 
        "   | |      | |   \n" +
        "   | |      | |   \n" +  
        "  _| |_    _| |_  \n" + 
        " |_____|  |_____| \n";

        String v_3 = "  _____    _____    _____  \n"+ 
        " |_   _|  |_   _|  |_   _| \n" + 
        "   | |      | |      | |   \n" +
        "   | |      | |      | |   \n" +
        "  _| |_    _| |_    _| |_  \n" +
        " |_____|  |_____|  |_____| \n";

        assertEquals(v_1, RomanPrinter.print(1));
        assertEquals(v_2, RomanPrinter.print(2));
        assertEquals(v_3, RomanPrinter.print(3));
    }

    @Test
    public void testPrimi6() {
        String v_4 = "  _____   __      __ \n" +
        " |_   _|  \\ \\    / / \n" +
        "   | |     \\ \\  / /  \n" +
        "   | |      \\ \\/ /   \n" +
        "  _| |_      \\  /    \n" +
        " |_____|      \\/     \n";

        String v_5 = " __      __ \n" +
        " \\ \\    / / \n" +
        "  \\ \\  / /  \n" +
        "   \\ \\/ /   \n" +
        "    \\  /    \n" +
        "     \\/     \n";

        String v_6 = " __      __   _____  \n" +
        " \\ \\    / /  |_   _| \n" +
        "  \\ \\  / /     | |   \n" +
        "   \\ \\/ /      | |   \n" +
        "    \\  /      _| |_  \n" +
        "     \\/      |_____| \n";

        assertEquals(v_4, RomanPrinter.print(4));
        assertEquals(v_5, RomanPrinter.print(5));
        assertEquals(v_6, RomanPrinter.print(6));
    }
}
