package Proyecto;

public class Numero {
    private double cifra;  //Atributos
    private double totalDigito; //Atributos


    public Numero(int i) {
        cifra = cifra;
        calcularCifra();
    }
    public double getProdcuto() {return totalDigito;} //Metodo Getter(De instancia) Devuelve el resultado de la cantidad de dígitos del número


    public void calcularCifra() { //Método de clase,la cual se encarga de saber la cantidad de cifras del número
        if (this.cifra >=0 && this.cifra < 10){
            this.totalDigito = 1;
        } else if (this.cifra >=10 && this.cifra < 100){
            this.totalDigito = 2;
        } else if(this.cifra >=100 && this.cifra < 1000){
            this.totalDigito = 3;
        } else if (this.cifra >=1000 && this.cifra < 10000){
            this.totalDigito = 4;
        }
       }
}
