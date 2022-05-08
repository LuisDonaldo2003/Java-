package Herencia;

public class cantidadCifra extends Numero {
    private int cifras;

    public cantidadCifra(int cifras){
        this.cifras = cifras;
        this.calcularCifra();
    }
    @Override
    public void calcularCifra() {
        if (cifras >=0 && cifras < 10){
            this.cifras = 1;
        } else if (cifras >=10 && cifras < 100){
            this.cifras = 2;
        } else if(cifras >=100 && cifras < 1000){
            this.cifras = 3;
        } else if (cifras >=1000 && cifras < 10000){
            this.cifras = 4;
        }
        this.cifra = this.cifras;
    }
}
