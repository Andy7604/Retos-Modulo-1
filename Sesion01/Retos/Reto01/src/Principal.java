
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente p1 = new Paciente("Lena Marie ", 25, "EXP202409");

        p1.mostrarInformacion();
        System.out.println();

        System.out.print("Ingrese el nombre del paciente: ");
        p1.nombre_p = sc.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        p1.edad_p = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el numero de expediente: ");
        p1.noExpediente_p = sc.nextLine();
        System.out.println();

        p1.mostrarInformacion();

    }
}
