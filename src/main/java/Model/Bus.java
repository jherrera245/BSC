package Model;

/**
 *
 * @author josue
 */
// Clase Bus para el modelo de datos.
public class Bus {

    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.
    
    /**
     * @return identificador, indice  o numero de registro del bus.
     */
    public int getIdBus() {
        return IdBus;
    }

    /**
     * @param IdBus identificador, indice o numero de registro del bus.
     */
    public void setIdBus(int IdBus) {
        this.IdBus = IdBus;
    }

    /**
     * @return identificador o indice de la ruta.
     */
    public int getIdRutaBus() {
        return IdRutaBus;
    }

    /**
     * @param IdRutaBus identificador o indice de la ruta.
     */
    public void setIdRutaBus(int IdRutaBus) {
        this.IdRutaBus = IdRutaBus;
    }

    /**
     * @return identificador o indice  del motorista.
     */
    public int getIdMotoristaBus() {
        return IdMotoristaBus;
    }

    /**
     * @param IdMotoristaBus identificador o indice del motorista.
     */
    public void setIdMotoristaBus(int IdMotoristaBus) {
        this.IdMotoristaBus = IdMotoristaBus;
    }

    /**
     * @return identificador o indice  del cobrador.
     */
    public int getIdCobradorBus() {
        return IdCobradorBus;
    }

    /**
     * @param IdCobradorBus identificador o indice  del cobrador.
     */
    public void setIdCobradorBus(int IdCobradorBus) {
        this.IdCobradorBus = IdCobradorBus;
    }

    /**
     * @return identificador o indice  del jefe.
     */
    public int getIdJefeBus() {
        return IdJefeBus;
    }

    /**
     * @param IdJefeBus identificador o indice  del jefe.
     */
    public void setIdJefeBus(int IdJefeBus) {
        this.IdJefeBus = IdJefeBus;
    }

    /**
     * @return Numero de Placa del Bus
     */
    public String getPlacaBus() {
        return PlacaBus;
    }

    /**
     * @param PlacaBus Numero de Placa del Bus
     */
    public void setPlacaBus(String PlacaBus) {
        this.PlacaBus = PlacaBus;
    }

    /**
     * @return marca del bus.
     */
    public String getMarcaBus() {
        return MarcaBus;
    }

    /**
     * @param MarcaBus marca del bus.
     */
    public void setMarcaBus(String MarcaBus) {
        this.MarcaBus = MarcaBus;
    }

    /**
     * @return modelo del bus.
     */
    public String getModeloBus() {
        return ModeloBus;
    }

    /**
     * @param ModeloBus modelo del bus.
     */
    public void setModeloBus(String ModeloBus) {
        this.ModeloBus = ModeloBus;
    }

    /**
     * @return serie del bus.
     */
    public String getSerieBus() {
        return SerieBus;
    }

    /**
     * @param SerieBus serie del bus
     */
    public void setSerieBus(String SerieBus) {
        this.SerieBus = SerieBus;
    }

    //Miembros de clase.
    private int IdBus;
    private int IdRutaBus;
    private int IdMotoristaBus;
    private int IdCobradorBus;
    private int IdJefeBus;
    private String PlacaBus;
    private String MarcaBus;
    private String ModeloBus;
    private String SerieBus;
}
