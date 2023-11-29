import java.util.Scanner;
class TiempoCompleto extends Empleado {
    Scanner lector = new Scanner(System.in);
    private int horasBonificacion;

    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param id
     * @param salarioBase Complejidad temporal : O(1) Tiempo constante
     */
    public TiempoCompleto(String nombre, int id, int salarioBase, int horasBonificacion) {
        super(nombre, id, salarioBase);
        this.horasBonificacion = horasBonificacion;
    }

    @Override
    public void infoEmpleados () {
        super.infoEmpleados();
    }

    @Override
    public void horasBoni () {
        super.horasBoni();
    }



    }

