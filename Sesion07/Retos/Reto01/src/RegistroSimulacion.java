import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {
    public static void main(String[] args){
        Path rutaArchivo = Paths.get("config/parametros.txt");

        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad lineal: 1.2 m/s\n" +
                "Número de estaciones: 8";

        try{
            if (!Files.exists(rutaArchivo.getParent())) {
                Files.createDirectories(rutaArchivo.getParent());
            }
            
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo escrito de manera exitosa.");

            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo existe.");
            } else {
                System.out.println("El archivo NO existe.");
            }

            String textoLeido = Files.readString(rutaArchivo);
            System.out.println("Contenido leído:");
            System.out.println(textoLeido);

        }catch(IOException e){
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }

}
