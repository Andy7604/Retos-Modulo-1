public class TransicionSimple implements TransicionHistoria {
    @Override
    public void realizarTransicion(String decision) {
        // Si el jugador escoge A o a, va al bosque; si no, regresa al pueblo
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("Eres muy valiente al decidir entrar al laberinto.");
        } else {
            System.out.println("Al parecer no te gustan las aventuras.");
        }
    }
}

