////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

    public static String convert(int number){

        if (number > 0 && number < 21){
            char[] char_numero = String.valueOf(number).toCharArray();
                
            String outString = "";

            if (char_numero.length == 1) {
                outString += unita[Integer.parseInt(String.valueOf(char_numero[0]))];
            } else {
                    
                if(Integer.parseInt(String.valueOf(char_numero[0])) == 1){
                    outString += "X";
                } else {
                    outString += "XX";
                }
                outString += unita[Integer.parseInt(String.valueOf(char_numero[1]))];
            }

            return outString;
        }
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}