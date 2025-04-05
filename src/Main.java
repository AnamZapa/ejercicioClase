//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; /*importo la biblioteca para usar el scanner*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /*defino clase para capturar valores por teclado*/
        String nombreEmpleado, documentoEmpleado = "";
        double salarioBruto, salarioNeto, valorHora, valorTotal, cantidadHoras, salarioMinimo;
        double bonificacion, deduccionSalud, deduccionPension, auxilioTransporte;
        double horasExtras, valorhorasExtras, fondosolidaridadPensional, retencionFuente;

        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.print("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        cantidadHoras = sc.nextDouble();
        System.out.print("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Ingrese el SMMLV del año en curso: ");
        salarioMinimo = sc.nextDouble();

        if (cantidadHoras > 24){
            System.out.println("Se puede proceder con el pago del empleado");
            salarioBruto = valorHora * cantidadHoras;
            deduccionPension = salarioBruto * 0.04;
            deduccionSalud = salarioBruto * 0.04;
            salarioMinimo = sc.nextDouble();
            if (salarioBruto <= (salarioMinimo*2)) {
                auxilioTransporte = 200000;
                bonificacion = salarioBruto * 0.1;
            } else {
                auxilioTransporte = 0;
                bonificacion = 0;
            }
            if (cantidadHoras > 96){
                horasExtras = cantidadHoras - 96;
                valorhorasExtras = (valorHora*0.25) * horasExtras;
            }
            System.out.println("Detalle de pago de: " + nombreEmpleado);
            System.out.println("El salario bruto del empleado: " + nombreEmpleado + " es $" + salarioBruto);
            System.out.println("La deducción por salud es $" + deduccionSalud);
            System.out.println("La deducción por pensión es $" + deduccionPension);
            System.out.println("El auxilio de transporte es $" + auxilioTransporte);
            System.out.println("La bonificación del 10% es $" + bonificacion);
            System.out.println("El valor de las horas extras es $" + valorhorasExtras);
            System.out.println("El salario a pagar es $" + (salarioBruto-deduccionPension-deduccionSalud+auxilioTransporte+bonificacion+horasExtras));
        } else  {
            System.out.println("Al empleado le faltan " + (24-cantidadHoras) + " horas para cumplir con el tiempo");
        }
    }
}