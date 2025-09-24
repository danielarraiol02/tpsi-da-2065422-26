package pt.uma.tpsi.ad.utils;

public class NumericalUtilities {

    public static int powerOf(int value, int power){
        int total = 1;
        for (int i = 0; i < power; i++){
            total *= value;
        }
        return total;
    }

    public static int sumOfNaturalNumbersUpTo(int maxValue){
        int sum = 0;
        for (int i = 1; i <= maxValue; i++){
            sum += i;
        }
        return sum;
    }
    public static int sumOfNaturalNumbersBetween(int minValue, int maxValue){
        int sum = 0;
        for (int i = minValue; i <= maxValue; i++){
            sum += i;
        }
        return sum;
    }
    public static int sumOfEvenNumbersBetween(int minValue, int maxValue){
        int sum = 0;
        for (int i = minValue; i <= maxValue; i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static int numberOfDivisorsOf(int value){
        int count = 0;
        for (int i = 1; i <= value; i++){
            if (value % i == 0){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int value){
        int nDivisores = numberOfDivisorsOf(value);
        return nDivisores == 2;
    }
}
