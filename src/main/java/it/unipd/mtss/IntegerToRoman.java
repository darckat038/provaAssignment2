////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private static String[] decine = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private static String[] centinaia = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
   
    public static String convert(int number){

        //Implementazione controllo > 0 && < 1001 altrimenti rifiuta
        if (number > 0 && number < 1001) {
            char[] char_numero = String.valueOf(number).toCharArray();
            String outString = "";
            if (char_numero.length == 1) {
                outString += unita[Integer.parseInt(String.valueOf(char_numero[0]))];
            } else if (char_numero.length == 2) {
                outString += decine[Integer.parseInt(String.valueOf(char_numero[0]))];
                outString += unita[Integer.parseInt(String.valueOf(char_numero[1]))];
            } else if (char_numero.length == 3) {
                outString += centinaia[Integer.parseInt(String.valueOf(char_numero[0]))];
                outString += decine[Integer.parseInt(String.valueOf(char_numero[1]))];
                outString += unita[Integer.parseInt(String.valueOf(char_numero[2]))];
            } else if (char_numero.length == 4) {
                outString += "M";
            }
            return outString;
        }
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}