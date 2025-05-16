import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del medicamento: ");
        String nombreM = sc.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double precioU = sc.nextInt();

        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidad = sc.nextInt();

        System.out.println();

        System.out.println(" --- Resumen de compra ---");
        System.out.println("Medicamento: " + nombreM);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioU);

        var totalSD = precioU * cantidad;
        System.out.println("Total sin descuento: $" + totalSD);

        boolean aplicaDes = totalSD > 500;
        System.out.println("¿Aplica descuento?: " + aplicaDes);

        var des = aplicaDes ? totalSD * 0.15 : 0;
        System.out.println("Descuento: " + des);

        var total = totalSD - des;
        System.out.println("Total a pagar: $" + total);

    }
}