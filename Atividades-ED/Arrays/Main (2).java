import java.util.Scanner;
//questao 1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10]; 

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade " + (i + 1) + ":");
            idades[i] = sc.nextInt();
        }

        System.out.println("Idades maiores de 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }

    }
}