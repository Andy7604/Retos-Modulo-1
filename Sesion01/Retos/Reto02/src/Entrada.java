//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Entrada {
    String nombreE;
    Double precioE;

    public Entrada(String nombreE, Double precioE) {
        this.nombreE = nombreE;
        this.precioE = precioE;
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreE + " | " + "Precio: $" + precioE);
    }

}