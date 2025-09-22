public class Main {
     public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500);
        Produto p2 = new Produto("Celular", -500); // inválido

        System.out.println(p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println(p2.getNome() + " - R$ " + p2.getPreco());
    }
}
