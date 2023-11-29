class Gerentes extends Empleado {
    private int añosEmpresa;

    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param id
     * @param salarioBase Complejidad temporal : O(1) Tiempo constante
     */
    public Gerentes(String nombre, int id, int salarioBase, int añosEmpresa) {
        super(nombre, id, salarioBase);
        this.añosEmpresa = añosEmpresa;
    }

    @Override
    public void infoEmpleados() {
        super.infoEmpleados();
    }

    public void años () {
        super.años();
    }
}
