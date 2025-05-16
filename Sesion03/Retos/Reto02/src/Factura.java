import java.util.Optional;

public class Factura {

    private double monto;
    private String description;
    private Optional<String> rfc;

    public Factura (double monto, String description, String rfc){
        this.monto = monto;
        this.description = description;
        this.rfc = Optional.ofNullable(rfc);
    }


    public String getResumen(){
        String resumen = "--------------- Factura generada ---------------\n";
        resumen += "\n";
        resumen += "Descripción: " + description + "\n";
        resumen += "Monto: $" + monto + "\n";
        resumen += "RFC: " + rfc.orElse("No se tiene registro de este dato") + "\n";

        return resumen;
    }

}
