import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisp;

    public CuentaFiscal(String rfc, double saldoDisp) {
        this.rfc = rfc;
        this.saldoDisp = saldoDisp;
        if (saldoDisp < 0){
            System.out.println("El saldo no puede ser negativo");
            this.saldoDisp = 0;
        }
    }

    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisp(){
        return saldoDisp;
    }

    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarInformacion(){
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisp);
    }
}
