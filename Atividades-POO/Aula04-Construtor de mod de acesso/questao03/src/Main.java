public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234, 500.0);
        conta.depositar(200);
        conta.sacar(100);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
