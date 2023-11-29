import java.util.Scanner;

public class Empleado {
    private String nombre;
    private  int id;
    private int salarioBase;

    private int horasBonificacion;

    Scanner lector = new Scanner(System.in);


    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param id
     * @param salarioBase
     *
     * Complejidad temporal : O(1) Tiempo constante
     *
     */
    public Empleado(String nombre, int id, int salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;

    }


    /**
     * Metodo get nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasBonificacion() {
        return horasBonificacion;
    }

    public void setHorasBonificacion(int horasBonificacion) {
        this.horasBonificacion = horasBonificacion;
    }

    /**
     * Metodo para mostrar información del empleado
     *
     * Complejidad Temporal : O(1) Tiempo constante
     */

    public void infoEmpleados () {
        System.out.println("Nombre: " + nombre);
        System.out.println(("Id: " + id));
        System.out.println(("Salario: " + salarioBase));
    }

    public void horasBoni () {
        System.out.println("Ingrese sus horas de bonificación trabajadas: ");
        int horas = lector.nextInt();
        System.out.println("Dinero extra: $" + horas*50.000);
    }

    public void horasDiari () {
        System.out.println("Ingrese la cantidad de horas que trabaja a diario: ");
        int diarias = lector.nextInt();
        System.out.println("Horas semanales: " + diarias*5);
    }

    public void años () {
        System.out.println("Ingrese cuantos años lleva en la empresa: ");
        int años = lector.nextInt();
        System.out.println("Sus años en la empresa le otorgan en ganacias: $" +años*1000000);
    }


}
