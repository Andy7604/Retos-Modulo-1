public record Entrada_E(String nombreE, double precioE) {
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreE + " | " + "Precio: $" + precioE);
    }
}
