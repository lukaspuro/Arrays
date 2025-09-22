import java.util.Scanner;
//questao 1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10]; 
        double maior = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (i == 0 || notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println("A maior nota foi: " + maior);
    }
}