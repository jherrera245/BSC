package Model;

/**
 *
 * @author josue
 */
//Clase ingreso para el modelo de datos.
public class Ingreso extends Detalle {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro de Ingreso
     */
    public int getIdIngreso() {
        return IdIngreso;
    }

    /**
     * @param IdIngreso, indice o numero de registro de Ingreso
     */
    public void setIdIngreso(int IdIngreso) {
        this.IdIngreso = IdIngreso;
    }

    /**
     * @return Fecha de Ingreso
     */
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso Fecha de ingreso
     */
    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    //Miembros de clase
    private int IdIngreso;
    private String FechaIngreso;
}
