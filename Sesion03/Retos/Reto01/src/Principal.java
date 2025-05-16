public class Principal {
    public static void main(String[] args){

        Pasajero p1 = new Pasajero("Andrea Carrillo", "JSSGDY323");

        Vuelo v = new Vuelo("AC123","Seúl, Corea del sur", "13:30");

        boolean reservado = v.reservarA(p1);
        if (reservado){
            System.out.println("Reserva de vuelo exitosa\n");
        } else {
            System.out.println("No se pudo realizar la reserva\n");
        }

        System.out.println(v.obtenerIntinerario());

        System.out.println(" Cancelando reserva\n");
        v.cancelarR();

        System.out.println(v.obtenerIntinerario());

        v.reservarA("Angela Carrillo", "NYE456");
        System.out.println(v.obtenerIntinerario());
    }
}
