package pt.uma.tpsi.ad.utils;

public class CharacterUtilities {

    public static char lowerLetterSuccessforOf(char carater) {
        if (carater >= 'a' && carater <= 'z'){
            if (carater == 'z'){
                return 'a';
            }
            else{
                return (char)(carater + 1);
            }
        }
        return carater;
    }

    public static char lowerLetterPredecessorOf(char carater) {
        if (carater >= 'a' && carater <= 'z'){
            if (carater == 'a'){
                return 'z';
            }
            else {
                return (char)(carater - 1);
            }
        }
        return carater;
    }

    public static char lowerLetterSucessorStepsOf(char carater, int steps) {
        char current = carater;

        for (int i = 0; i < steps; i++){
            current = lowerLetterSuccessforOf(current);
        }
        return current;
    }
    public static char lowerLetterPredecessorStepsOf(char carater, int steps){
        char current = carater;

        for (int i = 0; i < steps; i++){
            current = lowerLetterPredecessorOf(current);
        }
        return current;
    }

    public static int occurrencesOfCharacterIn(char[] array, char carater) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == carater){
                count++;
            }
        }
        return count;
    }

    public static char[] replaceCharacterIn(char[] array, char carater, char car_replace) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == carater){
                array[i] = car_replace;
            }
        }
        return array;
    }
    public static char[] concatenationOf(char[] array1, char[] array2) {

        char[] concatenatedArray = new char[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            concatenatedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            concatenatedArray[array1.length + i] = array2[i];
        }
        /*

        for (int j = array1.length; j < concatenatedArray.length; j++)
            concatenatedArray[j] = array2[j - array1.length];


         */

        return concatenatedArray;
    }
}
