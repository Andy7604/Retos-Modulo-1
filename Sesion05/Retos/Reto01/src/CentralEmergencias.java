public class CentralEmergencias {
    public static void main(String[] args){

        Ambulancia a1 = new Ambulancia("AMBULANCIA", "Sofia");
        a1.iniciarOperacion();
        System.out.println();

        Patrulla p1 = new Patrulla("PATRULLA", "Angela");
        p1.iniciarOperacion();
        System.out.println();

        UnidadBomberos b1 = new UnidadBomberos("UNIDAD DE BOMBEROS", "Fernanda");
        b1.iniciarOperacion();
    }
}
