package Herencia;

public abstract class Numero {
    protected int cifra;

    public abstract void calcularCifra();

    public int getCifra(){
        return this.cifra;
    }
}
