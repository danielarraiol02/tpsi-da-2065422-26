package pt.uma.tpsi.ad.utils;
import pt.uma.tpsi.ad.utils.Point;
public class Poligono {

    private int nPontos;
    private Point[] pontos;

    public Poligono(int nPontos) {
        this.nPontos = nPontos;
        this.pontos = new Point[nPontos];
    }


    public Point setPonto(int index, Point p) {
        if (index >= 0 && index < nPontos) {
            this.pontos[index] = p;
            return p;
        } else {
            return null;
        }
    }
    public Point getPonto(int index) {
        if (index >= 0 && index < nPontos) {
            return this.pontos[index];
        }
        return null;
    }
    public int getNPontos() {
        return nPontos;
    }
}
