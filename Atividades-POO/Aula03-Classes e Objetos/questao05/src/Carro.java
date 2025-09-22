public class Carro {
    String marca;
    String modelo;
    int ano;

    void informacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " (" + ano + ") está ligado!");
    }
}
