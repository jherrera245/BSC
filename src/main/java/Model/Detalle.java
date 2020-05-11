package Model;

/**
 *
 * @author josue
 */
// Clase Detalle para el modelo de datos.
public class Detalle {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.
    
    /**
     * @return identificador, indice o numero de registro de Detalle de Ingreso
     * o Egreso
     */
    public int getIdDetalle() {
        return IdDetalle;
    }

    /**
     * @param IdDetalle identificador, indice o numero de registro de Detalle de
     * Ingreso o Egreso
     */
    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    /**
     * @return identificador o indice de ingreso o egreso
     */
    public int getIdTipoDetalle() {
        return IdTipoDetalle;
    }

    /**
     * @param IdTipoDetalle identificador o indice de ingreso o egreso
     */
    public void setIdTipoDetalle(int IdTipoDetalle) {
        this.IdTipoDetalle = IdTipoDetalle;
    }

    /**
     * @return identificador o indice del bus
     */
    public int getIdBusDetalle() {
        return IdBusDetalle;
    }

    /**
     * @param IdBusDetalle identificador o indice del bus
     */
    public void setIdBusDetalle(int IdBusDetalle) {
        this.IdBusDetalle = IdBusDetalle;
    }

    /**
     * @return Monto de dinero de ingreso o egreso
     */
    public double getMontoDetalle() {
        return MontoDetalle;
    }

    /**
     * @param MontoDetalle Monto de dinero de ingreso o egreso
     */
    public void setMontoDetalle(double MontoDetalle) {
        this.MontoDetalle = MontoDetalle;
    }

    //Miembros de clase
    private int IdDetalle;
    private int IdTipoDetalle;
    private int IdBusDetalle;
    private double MontoDetalle;
}
