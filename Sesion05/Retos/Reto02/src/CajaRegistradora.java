public class CajaRegistradora {
    public static void main(String[] args){
        MetodoPago[] pagos = {
                new PagoEfectivo(250),
                new PagoTarjeta(350,320),
                new PagoTransferencia(4550, true)
        };

        for (MetodoPago p : pagos){
            if(p.autenticar()){
                System.out.println("-- AUTENTICACIÓN EXITOSA --");
                p.procesarPago();
                p.mostrarResumen();
            }else{
                System.out.println("-- FALLO DE AUTENTICACIÓN. " + p.getClass().getSimpleName() + " no válido. --");
            }
            System.out.println();
        }
    }
}
