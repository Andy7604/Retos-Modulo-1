import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Double> registros = new HashSet<>();

        System.out.println("=== MONITOR DE CONSUMO DE CPU ===");
        System.out.println("Ingresa 5 valores de consumo de CPU (0.0 - 100.0):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Servidor " + i + ": ");
            String linea = sc.nextLine();
            try {

                double consumo = Double.parseDouble(linea);

                if (consumo < 0 || consumo > 100) {
                    System.out.println("Valor fuera de rango (0-100%). Intenta de nuevo.");
                    i--;
                    continue;
                }

                if (registros.contains(consumo)) {
                    System.out.println("45" +
                            "45Ya registraste " + consumo + "%. Intenta otro valor.");
                    i--;   // <-- aquí forzamos repetir la misma iteración
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException(
                            "¡CRÍTICO! Consumo de " + consumo + "% excede el umbral del 95%."
                    );
                }

                registros.add(consumo);
                System.out.println("Registrado: " + consumo + "%");

            } catch (NumberFormatException e) {
                System.out.println("No es un número válido. Intenta de nuevo.");
                i--;

            } catch (ConsumoCriticoException e) {
                System.out.println("EXCEPCIÓN: " + e.getMessage());
                registros.add(Double.parseDouble(linea));
            } 
        }

        System.out.println("=== RESUMEN DE REGISTROS ===");
        for (Double c : registros) {
            System.out.println(" • " + c + "%");
        }

        sc.close();
        System.out.println("Monitoreo finalizado.");
    }
}
