public class PagoTarjeta extends MetodoPago {
    double saldoD;

    public PagoTarjeta(double monto, double saldoD) {
        super(monto);
        this.saldoD = saldoD;
    }

    @Override
    public boolean autenticar() {
        return saldoD >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}
