public class ProjetoCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Uno";
        c1.ano = 2010;

        Carro c2 = new Carro();
        c2.marca = "Toyota";
        c2.modelo = "Corolla";
        c2.ano = 2018;

        c1.modelo = "Uno Mille";
        c1.ano = 2011;

        System.out.println("== Carro 1 ==");
        c1.informacoes();

        System.out.println("\n== Carro 2 ==");
        c2.informacoes();

        System.out.println();
        c1.ligar();
        c2.ligar();
    }
}
