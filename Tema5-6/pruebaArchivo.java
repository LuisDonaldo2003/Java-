package Archivo;

import java.io.*;
import java.util.ArrayList;

public class pruebaArchivo {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Numero> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\Luis Donaldo\\IdeaProjects\\Archivos\\src\\Archivo\\numeros.txt";


    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Numero> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                int cifra = Integer.parseInt(elementosLinea[0]);
                listaEntrada.add(new Numero(cifra));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new Numero(0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Numero> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Cantiad,Digitos\n");
            for (int i=0; i < lista.size(); i++) {
                wr.append(lista.get(i).getCifra() +
                        "," + lista.get(i).getTotalDigito() +
                        "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivo prueba = new pruebaArchivo();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getCifra() + "\t" + prueba.getListaEntrada().get(i).getTotalDigito());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}
