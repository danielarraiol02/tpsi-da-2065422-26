import pt.uma.tpsi.ad.utils.CharacterUtilities;
import pt.uma.tpsi.ad.utils.CaesarCipherDecipherer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char nextChar = CharacterUtilities.lowerLetterSuccessforOf('a');
        System.out.println("Proximo carater: " + nextChar);
        char prevChar = CharacterUtilities.lowerLetterPredecessorOf('b');
        System.out.println("Carater anterior: " + prevChar);
        char lowLetterSteps = CharacterUtilities.lowerLetterSucessorStepsOf('a', 2);
        System.out.println("Proximo carater com steps: " + lowLetterSteps);
        char lowLetterStepsMinus = CharacterUtilities.lowerLetterPredecessorStepsOf('c', 2);
        System.out.println("Carater anterior com steps: " + lowLetterStepsMinus);
        char[] dummyArray = {'a', 'a', 'b', 'c'};
        char[] dummyArray2 = {'z', 'd', 'k', 'c'};

        int numberOccurrences = CharacterUtilities.occurrencesOfCharacterIn(dummyArray, 'x');
        System.out.println("N de vezes carater: " + numberOccurrences);
        char[] replacedChar = CharacterUtilities.replaceCharacterIn(dummyArray, 'c', 'p');
        System.out.println("Substituir carater: " + Arrays.toString(replacedChar));
        System.out.println("Arrays concatenados: " + Arrays.toString(CharacterUtilities.concatenationOf(dummyArray, dummyArray2)));
        String teste = "atacar";
        String codificado = CaesarCipherDecipherer.cipher(teste, 2);
        System.out.println("CODIFICADO: " + codificado);
        String descodificado = CaesarCipherDecipherer.decipher(codificado, 2);
        System.out.println("DESCODIFICADO: " + descodificado);

    }
}
