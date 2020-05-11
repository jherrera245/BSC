package Model;

/**
 *
 * @author josue
 */
public class Bitacora {
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.

    /**
     * @return id o numero de registro de bitacora
     */
    public int getIdBitacora() {
        return IdBitacora;
    }

    /**
     * @param IdBitacora id o numero de registro de bitacora
     */
    public void setIdBitacora(int IdBitacora) {
        this.IdBitacora = IdBitacora;
    }

    /**
     * @return id del lugar donde se realizo la bitacora.
     */
    public int getIdLugarBitacora() {
        return IdLugarBitacora;
    }

    /**
     * @param IdLugarBitacora id del lugar donde se realizo la bitacora.
     */
    public void setIdLugarBitacora(int IdLugarBitacora) {
        this.IdLugarBitacora = IdLugarBitacora;
    }

    /**
     * @return id del bus.
     */
    public int getIdBusBitacora() {
        return IdBusBitacora;
    }

    /**
     * @param IdBusBitacora id del bus.
     */
    public void setIdBusBitacora(int IdBusBitacora) {
        this.IdBusBitacora = IdBusBitacora;
    }

    /**
     * @return fecha en la que se registro la bitacora.
     */
    public String getFechaBitacora() {
        return FechaBitacora;
    }

    /**
     * @param FechaBitacora fecha en la que se registro la bitacora.
     */
    public void setFechaBitacora(String FechaBitacora) {
        this.FechaBitacora = FechaBitacora;
    }

    /**
     * @return hora en la que se registro la bitacora.
     */
    public String getHoraBitacora() {
        return HoraBitacora;
    }
    
    /**
     * @param HoraBitacora hora en la que se registro la bitacora.
     */

    public void setHoraBitacora(String HoraBitacora) {
        this.HoraBitacora = HoraBitacora;
    }

    //Miembros de clase.
    private int IdBitacora;
    private int IdLugarBitacora;
    private int IdBusBitacora;
    private String FechaBitacora;
    private String HoraBitacora;
}
