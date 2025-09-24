import pt.uma.tpsi.ad.utils.ArrayUtilities;
import pt.uma.tpsi.ad.utils.NumericalUtilities;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int teste = NumericalUtilities.powerOf(5, 3);
        System.out.println("Potencia de: " + teste);
        int teste2 = NumericalUtilities.sumOfNaturalNumbersUpTo(7);
        System.out.println("Soma de naturais ate: " + teste2);
        int teste3 = NumericalUtilities.sumOfNaturalNumbersBetween(1, 3);
        System.out.println("Soma de naturais entre: " + teste3);
        int teste4 = NumericalUtilities.numberOfDivisorsOf(7);
        System.out.println("Numero de divisores de: " + teste4);
        int value = 4;
        boolean teste5 = NumericalUtilities.isPrime(value);
        System.out.println(value + " é primo? " + teste5);
        final int[] values = {1, 2, 3};
        System.out.println("Array com virgulas: " + ArrayUtilities.toString(values));
        final int[] values2 = {7, 5, 9};
        System.out.println("Novo array " + ArrayUtilities.toString(ArrayUtilities.copyOf(values2)));
        System.out.println("Contains: " + ArrayUtilities.contains(values2, 15));
        System.out.println("Add array: " + ArrayUtilities.toString(ArrayUtilities.add(values2, 8)));
        System.out.println("Remove array: " + ArrayUtilities.toString(ArrayUtilities.remove(values2, 9)));

        final int[] arrayWithDuplicates = {10, 20, 30, 20, 40};
        boolean hasDuplicates = ArrayUtilities.containsDuplicates(arrayWithDuplicates);
        System.out.println("Array with duplicates " + ArrayUtilities.toString(arrayWithDuplicates) + " has duplicates? " + hasDuplicates);

        final int[] arrayWithoutDuplicates = {5, 10, 15, 20};
        boolean hasNoDuplicates = ArrayUtilities.containsDuplicates(arrayWithoutDuplicates);
        System.out.println("Array without duplicates " + ArrayUtilities.toString(arrayWithoutDuplicates) + " has duplicates? " + hasNoDuplicates);

        final int[] searchArray = {100, 200, 300, 400};
        int indexFound = ArrayUtilities.indexOf(searchArray, 300);
        System.out.println("Index of 300 in " + ArrayUtilities.toString(searchArray) + " is: " + indexFound);

        int indexNotFound = ArrayUtilities.indexOf(searchArray, 500);
        System.out.println("Index of 500 in " + ArrayUtilities.toString(searchArray) + " is: " + indexNotFound);


    }
}
