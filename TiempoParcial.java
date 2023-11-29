class TiempoParcial extends  Empleado {
    private int horasDiarias;
     /**
      * Constructor de la clase
      *
      * @param nombre
      * @param id
      * @param salarioBase Complejidad temporal : O(1) Tiempo constante
      */
     public TiempoParcial(String nombre, int id, int salarioBase, int horasDiarias) {
         super(nombre, id, salarioBase);
         this.horasDiarias = horasDiarias;
     }

    public int getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    @Override
    public void infoEmpleados () {
        super.infoEmpleados();
    }

    @Override
    public void horasDiari () {
         super.horasDiari();

    }
 }
