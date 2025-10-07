package pt.uma.tpsi.ad.utils;

public class CaesarCipherDecipherer {

    public static String cipher(String inputString, int steps) {

        String codedString = "";

        for (int i = 0; i < inputString.length(); i++) {

            char shiftedChar = CharacterUtilities.lowerLetterSucessorStepsOf(inputString.charAt(i), steps);

            codedString += shiftedChar;
        }
        return codedString;
    }

    public static String decipher(String inputString, int steps) {

        String codedString = "";

        for (int i = 0; i < inputString.length(); i++) {

            char shiftedChar = CharacterUtilities.lowerLetterPredecessorStepsOf(inputString.charAt(i), steps);

            codedString += shiftedChar;
        }
        return codedString;
    }
}
