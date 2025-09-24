import java.util.Arrays;

public class Main{
    /* -> Exercicio 7
    public static float perimetroRetangulo(float width, float height){
        return width * 2 + height * 2;
    }
    */

    /* -> Exercicio 8
    public static float volumeParal(float width, float height, float depth){
        return width * height * depth;
    }*/

    /* -> Exercicio 9
    public static double tempConv(double temperature){
        return (temperature - 32) * (5f/9f);
    }*/

    /* -> Exercicio 10
    public static int timeInterval (int hours, int minutes, int seconds){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }*/

    public static float[] arrayFunctions(float[] testArray){
        int size = testArray.length;
        float sum = 0;
        float max = testArray[0];
        float min = testArray[0];
        for (int i = 0; i < size; i++) {
            sum += testArray[i];
            max = (testArray[i] > max) ? testArray[i] : max;
            min = (testArray[i] < min) ? testArray[i] : min;
        }
        float media = sum / size;
        return new float[]{media, max, min};
    }

    public static void main(String[] args) {
        //float perimetro = perimetroRetangulo(5, 3);
        //System.out.println("Perimetro do retangulo: " + perimetro);
        //float volumeParal = volumeParal(5, 5, 5);
        //System.out.println("Volume do paralecoiso: " + volumeParal);
        //double converted = tempConv(100.00);
        //System.out.println("Graus em Celcius: " + converted);
        //int secondsPassed = timeInterval(1, 30, 5);
        //System.out.println("Passaram-se " + secondsPassed + " segundos");
        final float[] values = {0, 2, 4};
        float[] results = arrayFunctions(values);
        System.out.println("Media: " + results[0]);
        System.out.println("Max: " + results[1]);
        System.out.println("Min: " + results[2]);

    }
}