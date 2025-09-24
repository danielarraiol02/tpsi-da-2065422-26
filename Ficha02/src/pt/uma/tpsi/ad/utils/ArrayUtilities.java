package pt.uma.tpsi.ad.utils;

public class ArrayUtilities {
    public static String toString (int[] array){
        String stringFinal = "[";
        for (int i = 0; i < array.length; i++){
            stringFinal += array[i];
            if (i < array.length - 1) { //if i == array.length -1 str+=arr[i] + "]"; else str+=arr[i] + ", ";
                stringFinal += ", ";
            }
        }
        stringFinal += "]";
        return stringFinal;
    }
    public static int[] copyOf(int[] arrayToCopy){
        int[] newArray = new int[arrayToCopy.length];
        for (int i = 0; i < arrayToCopy.length; i++){
            newArray[i] += arrayToCopy[i];
        }
        return newArray;
    }
    public static boolean contains(int[] arrayToCheck, int valueToCheck){
        for (int i = 0; i < arrayToCheck.length; i++){
            if (arrayToCheck[i] == valueToCheck)
                return true;
        }
        return false;
    }
    public static boolean containsDuplicates(int[] arrayToCheck){
        for (int i = 0; i < arrayToCheck.length; i++)
            for (int j = i + 1 ; j < arrayToCheck.length; j++)
                if (j != i && arrayToCheck[j] == arrayToCheck[i])
                    return true;
        return false;
    }

    public static int indexOf(int[] arrayToCheck, int value) {
        for (int i = 0; i < arrayToCheck.length; i++){
            if (arrayToCheck[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static int[] add(int[] arrayOriginal, int value_to_add){
        int[] newArray = new int[arrayOriginal.length + 1];
        for (int i = 0; i < arrayOriginal.length; i++){
            newArray[i]+=arrayOriginal[i];
        }
        newArray[newArray.length - 1]+=value_to_add;
        return newArray;
    }

    public static int[] remove(int[] arrayOriginal, int value_to_remove){

        int count = countOccurences(arrayOriginal, value_to_remove);

        if (count == 0)
            return arrayOriginal;


        int[] newArray = new int[arrayOriginal.length - count];
        int newArrayIndex = 0;
        for (int i = 0; i < arrayOriginal.length; i++){
            if (arrayOriginal[i] != value_to_remove){
                newArray[newArrayIndex] = arrayOriginal[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }

    public static int countOccurences(int[] arrayOriginal, int value_to_check){
        int count = 0;
        for (int i = 0; i < arrayOriginal.length; i++){
            if (arrayOriginal[i] == value_to_check){
                count++;
            }
        }
        return count;
    }

}
