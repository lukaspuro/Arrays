public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;

    void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + nota1);
        System.out.println("Nota AV2: " + nota2);
        System.out.println("Média: " +  media());
    }

    double media() {
        return (nota1 + nota2) / 2.0;
    }

    void resultado() {
        double media = media();
        if (media >= 6.0) {
            System.out.println("Aluno " + nome + "está Aprovado. Nota: " + media);
        }else {System.out.println("Aluno  " + nome + "está Reprovado. Nota: " + media);
        }
    }
}
