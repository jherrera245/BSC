package ComboBox;

/**
 *
 * @author josue
 */
public class ComboBus {

    /**
     * Constructor de la Clase
     *
     * @param IdBus identificador o numero de registro de bus.
     * @param NumeroRuta numero de ruta.
     * @param Destino Nombre del destino.
     */
    public ComboBus(int IdBus, String NumeroRuta, String Destino) {
        this.IdBus = IdBus;
        this.NumeroRuta = NumeroRuta;
        this.Destino = Destino;
    }

    /**
     * @return identificador o numero de registro de bus.
     */
    public int getIdBus() {
        return IdBus;
    }

    @Override
    public String toString() {
        return "Ruta: " + NumeroRuta + ", Destino: " + Destino;
    }

    /**
     * @param obj objeto de tipo ComboBus
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComboBus) {
            ComboBus cbx = (ComboBus) obj;
            return (cbx.NumeroRuta.equals(this.NumeroRuta)) && (cbx.Destino.equals(this.Destino));
        }
        return false;
    }

    //Miembors de Clase
    private int IdBus;
    private String NumeroRuta;
    private String Destino;
}
