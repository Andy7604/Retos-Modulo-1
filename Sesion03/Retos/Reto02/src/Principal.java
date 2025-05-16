public class Principal {
    public static void main(String[] args){

        Factura rfc1 = new Factura(30000,"Venta de computadora", null);

        Factura rfc2 = new Factura(2500, "Curso de ingles", "JKTH9795");

        System.out.println(rfc1.getResumen());
        
        System.out.println(rfc2.getResumen());
    }
}
