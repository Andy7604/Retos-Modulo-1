public class MainNarrativa {
    public static void main(String[] args) {
        // Creamos cada parte del “motor” narrativo
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo      = new DialogoTexto();
        LogicaDecision decision    = new DecisionBinaria();

        // Simulamos una escena muy simple
        dialogo.mostrarDialogo("¡Bienvenido!");
        dialogo.mostrarDialogo("Ves la entrada a un labAerinto frente a ti...");
        dialogo.mostrarDialogo("¿Entrarás o regresarás a tu casa?");

        // Tomamos la decisión del usuario
        String eleccion = decision.tomarDecision();

        // Hacemos la transición correspondiente
        transicion.realizarTransicion(eleccion);

        // Fin de la “escena”
        dialogo.mostrarDialogo("La escena ha terminado. ¡Gracias por jugar!");
    }
}

