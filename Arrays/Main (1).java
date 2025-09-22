public class Main {
//questao 2
    public static void main(String[] args) {
        int[] numeros = {3, 8, 12, 5, 7, 14, 22, 9, 10, 30}; // vetor fixo com 10 números

        System.out.println("Numeros pares:");
        for (int n : numeros) {
            if (n % 2 == 0) { 
                System.out.println(n);
            }
        }
    }
}