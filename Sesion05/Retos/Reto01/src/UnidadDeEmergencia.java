public abstract class UnidadDeEmergencia {
    String nombre;

    public UnidadDeEmergencia(String nombre){
        this.nombre = nombre;
    }

    public void activarUnidad(){
        System.out.println("--- La unidad " + nombre + " ha sido activada ---");
    }

    public  abstract void respuesta();

}
