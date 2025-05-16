public class Main {
    public static void main(String[] args){

        Factura f1 = new Factura("13062013", "Kim Seokjin", 1992);
        Factura f2 = new Factura ("13062013", "Kim Namjoon", 1994);

        System.out.println("------- Comparación de facturas -------");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println();

        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));



    }
}
