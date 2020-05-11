package Model;

/**
 *
 * @author josue
 */
//Clase ingreso para el modelo de datos.
public class Egreso extends Detalle {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro de Egreso
     */
    public int getIdEgreso() {
        return IdEgreso;
    }

    /**
     * @param IdEgreso, indice o numero de registro de Egreso
     */
    public void setIdEgreso(int IdEgreso) {
        this.IdEgreso = IdEgreso;
    }

    /**
     * @return Fecha de Egreso
     */
    public String getFechaEgreso() {
        return FechaEgreso;
    }

    /**
     * @param FechaEgreso Fecha de ingreso
     */
    public void setFechaEgreso(String FechaEgreso) {
        this.FechaEgreso = FechaEgreso;
    }

    //Miembros de clase
    private int IdEgreso;
    private String FechaEgreso;
}
