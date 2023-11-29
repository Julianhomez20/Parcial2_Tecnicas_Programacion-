import java.util.Scanner;
import java.util.Timer;

public class Main { /**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {

        int salariosEmpresa = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Seleccione el tipo de empleado: \n1. Tiempo Completo \n2. Tiempo Parcial \n3. Gerente ");
        int tipoEmpleado = lector.nextInt();


        System.out.println("Ingrese el nombre de empleado: ");
        String nombre = lector.next();

        System.out.println("Ingrese el id el empleado: ");
        int id = lector.nextInt();


        System.out.println("Ingrese el salario del empleado: ");
        int salario = lector.nextInt();
        salariosEmpresa += salario;





        Empleado nuevoEmpleado = new Empleado(nombre, id, salario);

        switch (tipoEmpleado) {
            case 1:
                nuevoEmpleado.infoEmpleados();
                nuevoEmpleado.horasBoni();
                break;

            case 2:
                nuevoEmpleado.infoEmpleados();
                nuevoEmpleado.horasDiari();
                break;


            case 3:
                nuevoEmpleado.infoEmpleados();
                nuevoEmpleado.años();
                break;


        }
        System.out.println("La empresa en total paga: $" +salariosEmpresa+" de sueldo");


    }
    }
