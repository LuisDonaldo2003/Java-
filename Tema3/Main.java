package Proyecto2; // Nombre del paquete dependiendo cual pusiste,en mi caso es Proyecto2

public class Prueba {
    public static void main(String[] args){
        //Llamar a un método de clase

        System.out.println("Es un método de clase en una clase pública");
        System.out.println(Numero.calcularLaCifra(34));

        //Clase abstracta
        System.out.println("Es un método de clase en una clase abstracta");
        System.out.println(NumeroAbs.Cantidad(54));

        //Llamar a un método de instancia
        System.out.println("Es un método de instancia");
        Numero num = new Numero();
        System.out.println(num.calcularCifra(45));




    }
}
