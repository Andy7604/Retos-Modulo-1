public class PagoTransferencia extends MetodoPago{
    boolean validacionE;

    public PagoTransferencia(double monto, boolean validacionE){
        super(monto);
        this.validacionE = validacionE;
    }

    @Override
    public boolean autenticar(){
        return validacionE;
    }

    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}
