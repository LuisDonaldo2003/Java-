package Proyecto;

public abstract class NumeroAbs {

    public static double Cantidad(int cifra) { //No se ocupa el this en abstracta

        double totalDigito = 0;
        if (cifra >= 0 && cifra < 10) {
            totalDigito = 1;
        } else if (cifra >= 10 && cifra < 100) {
            totalDigito = 2;
        } else if (cifra >= 100 && cifra < 1000) {
            totalDigito = 3;
        } else if (cifra >= 1000 && cifra < 10000) {
            totalDigito = 4;
        }
        return totalDigito;
    }

}
