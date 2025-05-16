import java.util.Objects;

public class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }


    public int getPrioridad(){
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + ", Prioridad: " + prioridad;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Tema)) return false;
        Tema tema = (Tema) o;
        return Objects.equals(titulo, tema.titulo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo);
    }
}