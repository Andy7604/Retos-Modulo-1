public class Paciente {
    String nombre_p;
    int edad_p;
    String noExpediente_p;

    public Paciente(String nombre_p, int edad_p, String noExpediente_p) {
        this.nombre_p = nombre_p;
        this.edad_p = edad_p;
        this.noExpediente_p = noExpediente_p;
    }

    public void mostrarInformacion() {
        System.out.println("-- Datos del paciente -- ");
        System.out.println("Nombre: " + nombre_p);
        System.out.println("Edad: " + edad_p);
        System.out.println("Expediente: " + noExpediente_p);
    }
}