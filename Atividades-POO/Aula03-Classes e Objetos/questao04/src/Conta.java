public class Conta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "001-12345";
        conta1.titular = "Carlos";
        conta1.saldo = 100.0;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = "002-54321";
        conta2.titular = "Daniela";
        conta2.saldo = 50.0;

        conta1.consultarSaldo();
        conta1.depositar(200.0);
        conta1.sacar(50.0);
        conta1.consultarSaldo();

        conta2.consultarSaldo();
        conta2.sacar(100.0); 
        conta2.depositar(150.0);
        conta2.sacar(100.0);
        conta2.consultarSaldo();
    }
}
