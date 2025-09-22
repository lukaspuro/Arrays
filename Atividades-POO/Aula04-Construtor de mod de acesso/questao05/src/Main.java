public class Main{
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", 123);
        Endereco e2 = new Endereco("Rua B", 456);

        Pessoa p1 = new Pessoa("João", 20, e1);
        Pessoa p2 = new Pessoa("Maria", 25, e2);

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
