public class Vuelo {

    public static final String codigoV = "AB1306";
    private String destino;
    private String horaS;
    private Pasajero asientoR;

    public Vuelo(String codigoV, String destino, String horaS){
        this.destino = destino;
        this.horaS = horaS;
    }

    public boolean reservarA(Pasajero p){
        if (asientoR == null){
            asientoR = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarA(String nombre, String pasaporte){
        Pasajero nuevoP = new Pasajero(nombre, pasaporte);
        return reservarA(nuevoP);
    }

    public void cancelarR(){
        asientoR = null;
    }

    public String obtenerIntinerario(){
        String info = "----- Intinerario del vuelo ----\n";
        info += "Código del vuelo: " + codigoV + "\n";
        info += "Destino: " + destino + "\n";
        info += "Hora de salida: " + horaS + "\n";
        if (asientoR != null){
            info += "Pasajero: " + asientoR.nombre + "\n";
        } else {
            info += "Pasajero: Sin reserva \n";
        }
        return info;
    }

}

