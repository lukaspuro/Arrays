import java.util.Scanner;
//questao 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nota = new double[4];
        double soma = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + " : ");
            nota[i] = sc.nextDouble();
            soma += nota[i]; 
        }

        double media = soma / nota.length;
        System.out.println("A média das notas é: " + media);
    }
}