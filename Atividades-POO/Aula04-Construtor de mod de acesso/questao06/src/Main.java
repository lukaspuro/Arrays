public class Main{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro l1 = new Livro("Java Básico", "Autor A");
        Livro l2 = new Livro("POO em Java", "Autor B");
        Livro l3 = new Livro("Estruturas de Dados", "Autor C");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("POO em Java");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("POO em Java");
        biblioteca.mostrarLivros();
    }
}