public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro obj1 = new Livro();
        Livro obj2 = new Livro();

        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.paginas = 304;
        obj1.ano = 1997;
        obj1.preco = 25.90;

        obj2.titulo = "O Pequeno Príncipe";
        obj2.paginas = 96;
        obj2.ano = 1943;
        obj2.preco = 18.50;

        System.out.println("Livro 1");
        System.out.println("Título: " + obj1.titulo);
        System.out.println("Nº Páginas: " + obj1.paginas);
        System.out.println("Ano: " + obj1.ano);
        System.out.println("Preço: R$ " + obj1.preco);

        System.out.println("Livro 2");
        System.out.println("Título: " + obj2.titulo);
        System.out.println("Nº Páginas: " + obj2.paginas);
        System.out.println("Ano: " + obj2.ano);
        System.out.println("Preço: R$ " + obj2.preco);

        // invocação de métodos
        obj1.cadastrar();
        double frete1 = obj1.frete("66097-055");
        System.out.printf("Frete (Livro 1): R$ %.2f%n", frete1);
        obj2.vender();
        System.out.println(obj2.trocar());
    }
}
