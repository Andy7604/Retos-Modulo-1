import java.util.*;

public class MuestrasGeneticas  {
        public static void main(String[] args) {

            System.out.println("----- REGISTRO DE MUESTRAS GENÉTICAS ------");
            System.out.println("");

            // ArrayList para registrar el orden en que llegaron las muestras
            ArrayList<String> especies = new ArrayList<>();
            especies.add("Homo sapiens");
            especies.add("Mus musculus");
            especies.add("Arabidopsis thaliana");
            especies.add("Homo sapiens");

            System.out.println("Orden de llegada de las muestras:");
            for (int i = 0; i < especies.size(); i++) {
                System.out.println(i + 1 + ". " + especies.get(i));
            }

            // HashSet para obtener una lista de especies unicas
            HashSet<String> especiesunicas = new HashSet<>(especies); // Elimina duplicados

            System.out.println("\nEspecies únicas:");
            for (String eunicas : especiesunicas) {
                System.out.println("- " + eunicas);
            }

            // HashMap para asociar el ID de la muestra con el nombre del investigador.
            HashMap<String, String> relacionIdI = new HashMap<>();
            relacionIdI.put("M-001", "Dra. López");
            relacionIdI.put("M-002", "Dr. Hernández");
            relacionIdI.put("M-003", "Dra. Carrillo");

            System.out.println("\nDoctores que investigaron las muestras (ID muestra → Dr):");
            for (Map.Entry<String, String> entry : relacionIdI.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }

            // Buscar causa el nombre del investigador por ID de la muestra
            String idBuscar = "M-003";
            System.out.println("\nMuestra " + idBuscar + " investigada por: " + relacionIdI.get(idBuscar));
        }
    }