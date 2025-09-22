public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.matricula = 12345;
        a1.nota1 = 7.5;
        a1.nota2 = 6.0;

        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.matricula = 67890;
        a2.nota1 = 5.0;
        a2.nota2 = 4.5;

        
        System.out.println("Aluno 1");
        a1.informacoes();
        System.out.println("Aluno 2");
        a2.informacoes();

        
        a2.nota2 = 6.5;
        System.out.println("Após atualização da nota do Aluno 2:");
        a2.informacoes();

        a1.resultado();
        a2.resultado();
    }
}
