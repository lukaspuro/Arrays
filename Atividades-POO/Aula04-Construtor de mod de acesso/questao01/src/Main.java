public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Carlos", 30);

        System.out.println("Pessoa 1: " + p1.nome + ", " + p1.idade);
        System.out.println("Pessoa 2: " + p2.nome + ", " + p2.idade);
    }
}
