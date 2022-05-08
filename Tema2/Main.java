package Proyecto; //El nombre del paquete es dependiendo el nombre de tu paquete de proyecto,en mi caso es proyecto 



public class Main {
    public static void main(String[] args){
        //La clase pública va a realizar la instancia
        System.out.println("Metodos de la clase de Instancia");
        Numero numeros = new Numero(5);
        System.out.println("La cantidad de digitos de la cifra es: " + numeros.getProdcuto());


         //La clase asbtracta no puede realizar instancia
        System.out.println("Metodos de la clase abstracta");
        System.out.println("La cantidad de digitos de la cifra es: " + NumeroAbs.Cantidad(4652));

    }

}
