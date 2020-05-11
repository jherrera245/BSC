package Model;

/**
 *
 * @author josue
 */
// Clase Castigo para el modelo de datos.
public class Castigo {
    
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return identificador, indice o numero de registro de castigo
     */
    public int getIdCastigo() {
        return IdCastigo;
    }

    /**
     * @param IdCastigo identificador, indice o numero de registro de castigo
     */
    public void setIdCastigo(int IdCastigo) {
        this.IdCastigo = IdCastigo;
    }

    /**
     * @return identificador o indice del bus
     */
    public int getIdBusCastigo() {
        return IdBusCastigo;
    }

    /**
     * @param IdBusCastigo identificador o indice del bus
     */
    public void setIdBusCastigo(int IdBusCastigo) {
        this.IdBusCastigo = IdBusCastigo;
    }

    /**
     * @return Fecha de Inicio del Castigo
     */
    public String getFechaInicioCastigo() {
        return FechaInicioCastigo;
    }

    /**
     * @param FechaInicioCastigo Fecha de Inicio del Castigo
     */
    public void setFechaInicioCastigo(String FechaInicioCastigo) {
        this.FechaInicioCastigo = FechaInicioCastigo;
    }

    /**
     * @return Fecha de Finalizacion del Castigo 
     */
    public String getFechaFinCastigo() {
        return FechaFinCastigo;
    }

    /**
     * @param FechaFinCastigo Fecha de Finalizacion del castigo
     */
    public void setFechaFinCastigo(String FechaFinCastigo) {
        this.FechaFinCastigo = FechaFinCastigo;
    }

    /**
     * @return Estado del castigo
     */
    public String getEstadoCastigo() {
        return EstadoCastigo;
    }

    /**
     * @param EstadoCastigo  Estado del castigo
     */
    public void setEstadoCastigo(String EstadoCastigo) {
        this.EstadoCastigo = EstadoCastigo;
    }

    //Miembros de Clase
    private int IdCastigo;
    private int IdBusCastigo;
    private String FechaInicioCastigo;
    private String FechaFinCastigo;
    private String EstadoCastigo;
}
