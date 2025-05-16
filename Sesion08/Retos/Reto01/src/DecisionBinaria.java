import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer?");
        System.out.println("A) Entrar al laberinto");
        System.out.println("B) Regresar a mi casa");
        System.out.print("Elige A o B: ");
        String eleccion = sc.nextLine().trim().toUpperCase();
        // No validamos demasiado, solo repetimos si no es A/B
        while (!eleccion.equals("A") && !eleccion.equals("B")) {
            System.out.print("Opción inválida. Escribe A o B: ");
            eleccion = sc.nextLine().trim().toUpperCase();
        }
        return eleccion;
    }
}

