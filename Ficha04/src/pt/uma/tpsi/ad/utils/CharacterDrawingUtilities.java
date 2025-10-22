package pt.uma.tpsi.ad.utils;

public class CharacterDrawingUtilities {

    public static void drawElement(char value){
        System.out.print(value);
    }

    public static void drawNewLine(){
        System.out.println();
    }

    public static void drawHorizontalSegmentWith(int width, char value){
        for (int i = 0; i < width; i++) {
            drawElement(value);
        }
    }

    public static void drawFilledRectangleWith(int height, int width, char value){
        for (int i = 0; i < height; i++) {

            drawHorizontalSegmentWith(width, value);

            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(int height, int width, char value){

        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1){
                    drawElement(value);
                } else {
                    drawElement(' ');
                }
            }
            drawNewLine();
        }
    }
}