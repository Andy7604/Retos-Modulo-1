import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var saldo = 1000;
        int op;

        System.out.println(" --- Bienvenido al cajero automático ---");

        do{
            System.out.println();
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println();

            System.out.print("Ingrese el número de la operación que desea realizar: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.print("Su saldo actual es: " + saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    int d = sc.nextInt();
                    saldo += + d;

                    System.out.println("Depósito exitoso. Su saldo actual es: " + saldo);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad que desea retirar: ");
                    int r = sc.nextInt();

                    saldo -= r;

                    System.out.println("Retiro exitoso. Su saldo actual es: " + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta. Vuelva a intentar.");
            }

        }while(op != 4);
    }
}
