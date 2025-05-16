public class Patrulla extends UnidadDeEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla(String nombre, String nombreO){
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreO);
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSonido();
        operador.reportarse();
        respuesta();
    }

    @Override
    public void respuesta(){
        System.out.println(" Patrulla atendiendo situación de seguridad ciudadana.");
    }
}