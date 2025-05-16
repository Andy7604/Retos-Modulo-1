import java.util.Objects;

public class Factura {

    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    public String toString(){
        return "Factura { " +
                "Folio: " + folio +
                ", Cliente: " + cliente +
                ", Total: $" + total + " }";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return folio.equals(otro.folio);
    }

    @Override
    public int hashCode(){
        return Objects.hash(folio);
    }
}