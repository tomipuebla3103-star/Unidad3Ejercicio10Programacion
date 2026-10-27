public class BilleteraVirtual {
    private String alias;
    private double saldo;
    private double limiteDiarioTransferencia;

    public BilleteraVirtual(String alias, double saldo, double limiteDiarioTransferencia) {
        this.alias = alias;
        this.saldo = saldo;
        this.limiteDiarioTransferencia = limiteDiarioTransferencia;
    }

    public boolean transferir(double monto) {
        if (monto > 0 && monto <= saldo && monto <= limiteDiarioTransferencia) {
            saldo = saldo - monto;
            System.out.println("Transferencia realizada correctamente");
            return true;
        } else {
            System.out.println("Transferencia rechazada");
            return false;
        }
    }

    public void cambiarLimiteDiario(double nuevoLimite, String aliasTitular) {
        if (alias.equals(aliasTitular) && nuevoLimite > 0) {
            limiteDiarioTransferencia = nuevoLimite;
            System.out.println("Limite actualizado correctamente");
        } else {
            System.out.println("No se pudo cambiar el limite");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDiarioTransferencia() {
        return limiteDiarioTransferencia;
    }

    public String getAlias() {
        return alias;
    }
}
