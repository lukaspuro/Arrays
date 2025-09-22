class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador++] = livro;
        } else {
            System.out.println("Biblioteca cheia!");
        }
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void mostrarLivros() {
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro.getTitulo() + " - " +
                        (livro.isDisponivel() ? "Disponível" : "Emprestado"));
            }
        }
    }
}