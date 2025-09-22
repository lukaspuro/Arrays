public class Livro {
    String titulo;
    int paginas;
    int ano;
    double preco;

    void cadastrar(){
        System.out.println("Cadastrando no banco de dados");
    }

    double frete(String cep){
        System.out.println("Calculando frete " + cep);
        double valorFrete = 10.0 + 0.05 * paginas;
        return valorFrete;
    }

    void vender(){
        System.out.printf("Vendendo livro por R$ %.2f%n", preco);
    }

    String trocar(){
        return "Livro trocado!";
    }
}
