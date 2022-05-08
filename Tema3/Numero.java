package Proyecto2;

public class Numero {
    private int cifra;  //Atributos
    private int totalDigito; //Atributos
    private static int cifras;
    private static int totalesdigitos;


    public Numero() {
        this.cifra = cifra;
        this.cifras = cifras;
    }

    public int calcularCifra(int cifra) {
        if (cifra >=0 && cifra < 10){
            this.totalDigito = 1;
        } else if (cifra >=10 && cifra < 100){
            this.totalDigito = 2;
        } else if(cifra >=100 && cifra < 1000){
            this.totalDigito = 3;
        } else if (cifra >=1000 && cifra < 10000){
            this.totalDigito = 4;
        }
        return totalDigito;

    }

    public static int calcularLaCifra(int cifras) {
        if (cifras >= 0 && cifras < 10) {
            totalesdigitos = 1;
        } else if (cifras >= 10 && cifras < 100) {
            totalesdigitos = 2;
        } else if (cifras >= 100 && cifras < 1000) {
            totalesdigitos = 3;
        } else if (cifras >= 1000 && cifras < 10000){
            totalesdigitos = 4;
        }
        return totalesdigitos;
    }
}
