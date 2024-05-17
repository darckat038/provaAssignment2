////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI"};

    public static String convert(int number){

        if (number > 0 && number < 7){
            return unita[number];
        }
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}