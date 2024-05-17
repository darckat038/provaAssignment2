////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){
        if (number > 0 && number < 4){
            if (number == 1){
                return "I";
            } else if (number == 2){
                return "II";
            } else {
                return "III";
            }
        }
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}