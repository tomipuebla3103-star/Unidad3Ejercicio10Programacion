//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BilleteraVirtual billetera = new BilleteraVirtual("tomi.mp", 50000, 20000);

    System.out.println("Alias: " + billetera.getAlias());
    System.out.println("Saldo inicial: $" + billetera.getSaldo());

    billetera.transferir(10000);
    billetera.transferir(25000);
    billetera.transferir(50000);
    billetera.transferir(-1000);

    System.out.println();

    billetera.cambiarLimiteDiario(30000, "tomi.mp");
    billetera.cambiarLimiteDiario(50000, "otro.alias");

    billetera.transferir(25000);

    System.out.println();
    System.out.println("Saldo final: $" + billetera.getSaldo());
    System.out.println("Limite diario: $" + billetera.getLimiteDiarioTransferencia());
}
