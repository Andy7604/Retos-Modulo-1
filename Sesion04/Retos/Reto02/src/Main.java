public class Main {
    public static void main(String[] args){
        DeclaracionImpuestos d1 = new DeclaracionImpuestos("ABC240501", 4500);

        CuentaFiscal c1 = new CuentaFiscal("ABC240500",-7546);

        System.out.println("Declaración enviada por RFC: " + d1.rfcContribuyente() +
                " por $" + d1.montoD());
        c1.mostrarInformacion();

        // Validamos si el RFC de la declaración es válido
        boolean rfcV = c1.validarRFC(d1);
        System.out.println("¿El RFC es válido para esta cuenta?: " + rfcV);
    }
}
