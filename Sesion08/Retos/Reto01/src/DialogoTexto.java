public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        // Solo imprime el texto tal cual
        System.out.println("[DIÁLOGO] " + texto);
    }
}

