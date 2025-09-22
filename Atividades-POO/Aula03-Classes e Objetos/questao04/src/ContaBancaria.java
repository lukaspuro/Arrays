public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado. Saldo atual: R$ %.2f%n", valor, saldo);
    }

    boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f%n", valor, saldo);
        return true;
    }

    void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (titular: %s): R$ %.2f%n", numeroConta, titular, saldo);
    }
}
