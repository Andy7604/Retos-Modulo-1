import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("src/errores.log");
        Path rutaRegistro = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int errores = 0;
        int warnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaArchivo)) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    errores++;
                }

                if (linea.contains("WARNING")) {
                    warnings++;
                }
            }

            mostrarResumen(totalLineas, errores, warnings);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());


            try (BufferedWriter escritor = Files.newBufferedWriter(rutaRegistro)) {
                escritor.write("Se produjo un error al procesar el archivo de logs:" + e.getMessage());

            } catch (IOException ex) {
                System.out.println("No se pudo escribir en registro_fallos.txt: ");
            }
        }
    }

    public static void mostrarResumen(int totalLineas, int errores, int warnings) {
        int totalProblemas = errores + warnings;
        double porcentajeErrores = (totalLineas > 0) ? ((double) errores / totalLineas) * 100 : 0;
        double porcentajeWarnings = (totalLineas > 0) ? ((double) warnings / totalLineas) * 100 : 0;

        System.out.println("--- Resumen del análisis ---");
        System.out.println("Total de líneas leídas: " + totalLineas);
        System.out.println("Cantidad de errores: " + errores);
        System.out.println("Cantidad de advertencias: " + warnings);
        System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
        System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);
    }

}

