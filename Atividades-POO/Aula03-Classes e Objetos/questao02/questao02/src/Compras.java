public class Compras {
    String iditem;
    String item;
    double valor;

    void compra() {
        System.out.println("Item:" + item);
        System.out.println("Valor:" + valor);
        System.out.println("Código do item:" + iditem);
    }

    void historico() {
        System.out.println("Mostrando histórico de compras");
    }
}
