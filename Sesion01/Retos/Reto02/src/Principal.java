public class Principal {
    public static void main(String[] args) {
        Entrada e1 = new Entrada(" BTS concert ", 5768.00);
        Entrada e2 = new Entrada(" MUSE concert ", 2578.00);

        e1.mostrarInformacion();
        System.out.println();

        e2.mostrarInformacion();
        System.out.println();

        Entrada_E e3= new Entrada_E(" Keane concert ", 3450.00);
        e3.mostrarInformacion();
    }
}
