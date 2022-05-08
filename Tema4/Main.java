package Herencia; //nombre del paquete dependiendo del tuyo,en mi caso es Herencia

public class Main {
    public static void main(String args[]){
        cantidadCifra num = new cantidadCifra(23);
        System.out.println("La cantidad de cifras del numero es: " + num.getCifra() + " cifras");
    }
}
