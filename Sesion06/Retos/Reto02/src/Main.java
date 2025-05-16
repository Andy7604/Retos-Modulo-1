import java.util.concurrent.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- PLAN MENSUAL DE TEMAS EDUCATIVOS -----\n");

        // Lista concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Tecnología, educación y sociedad: Estudios de caso y perspectivas innovadoras", 2));
        temas.add(new Tema("Educar para el cambio", 1));
        temas.add(new Tema("Perspectivas curriculares y pertinencia social", 3));

        // Mostrar orden alfabético
        Collections.sort(temas);

        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println("• " + t);
        }


        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.getPrioridad(), b.getPrioridad()); // Prioridad ascendente
            }
        });

        System.out.println("\nTemas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println("• " + t);
        }

        // Repositorio concurrente de recursos (tema → enlace o descripción)
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Tecnología, educación y sociedad: Estudios de caso y perspectivas innovadoras", "https://acortar.link/czOI00");
        recursos.put("Educar para el cambio", "https://www.digitaliapublishing.com/a/173756/educar-para-el-cambio");
        recursos.put("Perspectivas curriculares y pertinencia social", "https://www.digitaliapublishing.com/a/173815/perspectivas-curriculares-y-pertinencia-social");

        System.out.println("\nRepositorio de recursos compartidos:");
        for (Map.Entry<String, String> entry : recursos.entrySet()) {
            System.out.println("• " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
