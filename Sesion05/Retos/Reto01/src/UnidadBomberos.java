public class UnidadBomberos extends UnidadDeEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, String nombreO){
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
        System.out.println(" Unidad de bomberos respondiendo a incendio estructural.");
    }
}