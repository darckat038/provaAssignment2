////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private static String[] decine = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};

    public static String convert(int number){

        if (number > 0 && number < 101) {
            char[] char_numero = String.valueOf(number).toCharArray();
            String outString = "";
            if (char_numero.length == 1) {
                outString += unita[Integer.parseInt(String.valueOf(char_numero[0]))];
            } else if (char_numero.length == 2) {
                outString += decine[Integer.parseInt(String.valueOf(char_numero[0]))];
                outString += unita[Integer.parseInt(String.valueOf(char_numero[1]))];
            } else if (char_numero.length == 3) {
                outString += "C";
                outString += decine[Integer.parseInt(String.valueOf(char_numero[1]))];
                outString += unita[Integer.parseInt(String.valueOf(char_numero[2]))];
            }
            return outString;
        }
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}