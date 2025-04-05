//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*salario bruto, deducciones (salud pension) hExtras,
valor hExtras, bonificacion del 10% si salario no supera 2 SMMLV
,Aux transporte hasta 2 SMMLV, no puede trabajar menos de 24 h, hExtras cuentas despues de 96,
add pago a fondo de solidaridad pensional(si aplica), retencion */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String idEmpleado = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double deduccionSalud = 0;
        double deduccionPension = 0;
        double hExtras = 0;
        double valorhExtras = 0;
        double bonificacion = 0;
        double fondoSolidaridadPensional = 0;
        double valorRetefuente = 0;
        double auxTransporte = 0;
        double salarioMinimo = 0;


        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese id del empleado: ");
        idEmpleado = sc.nextLine();
        System.out.println("Ingrese valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese cantidad horas: ");
        cantidadHoras = sc.nextDouble();
        System.out.println("Ingrese valor del salrio minimo lactual: ");
        salarioMinimo = sc.nextDouble();

        if (cantidadHoras >= 24) {

            salarioBruto = valorHora * cantidadHoras;
            deduccionPension = salarioBruto * 0.04;
            deduccionSalud = salarioBruto * 0.04;

        if (salarioBruto <=(salarioMinimo*2)){

            auxTransporte = 200000;
            bonificacion = (salarioBruto * 0.1);
        } else{
            auxTransporte = 0;
            bonificacion = 0;
        }
        if(cantidadHoras > 96) {
            hExtras = cantidadHoras - 96;
            valorhExtras = valorHora * 1.25;
        }
            System.out.println("Detalle de pago: " + nombreEmpleado);
            System.out.println("Se le puede pagar al empleado ");
            System.out.println("El salario bruto del empleado " + nombreEmpleado + " es $ " + salarioBruto);
            System.out.println("El total por Salud es: " + deduccionSalud );
            System.out.println("El total por Pension es: " + deduccionPension);
            System.out.println("El auxilio de transporte es: " + auxTransporte);
            System.out.println("la bonificacion es: " + bonificacion);
            System.out.println("El pago por horas extras es: " + valorhExtras);
            System.out.println("Valor salario neto: " + (salarioBruto - deduccionPension - deduccionSalud + auxTransporte + bonificacion + valorhExtras));


        } else{
            System.out.println("Le fatan:  " + (24- cantidadHoras) +" horas de trabajo");

        }
    }
}