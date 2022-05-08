public class Numero {
    private int cifra;
    private int totalDigito;


    public Numero(int cifra){
        this.cifra = cifra;
        this.calcularCifra();
    }

    public int getTotalDigito(){
        return totalDigito;
    }

    public void calcularCifra(){
        if ((this.cifra >=0 && this.cifra < 10)){
            this.totalDigito = 1;
        } else if (this.cifra >=10 && this.cifra < 100){
            this.totalDigito = 2;
        } else if(this.cifra >=100 && this.cifra < 1000){
            this.totalDigito = 3;
        } else if (this.cifra >=1000 && this.cifra < 10000){
            this.totalDigito = 4;
        }
    }

    public static void main(String[] args){
        Numero numero = new Numero(60);
        System.out.println(numero.getTotalDigito());
    }
}
