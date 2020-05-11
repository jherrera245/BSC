package ComboBox;

/**
 *
 * @author josue
 */
//Combobox personalizado para jefes
public class ComboLugar {

    /**
     * Constructor de la Clase
     *
     * @param IdLugar identificador o indice de jefe
     * @param NombreLugar Nombre del Lugar
     */
    public ComboLugar(int IdLugar, String NombreLugar) {
        this.IdLugar = IdLugar;
        this.NombreLugar = NombreLugar;
    }

    /**
     * @return Identificador o indie de jefe 
     */
    public int getIdLugar() {
        return IdLugar;
    }

    /**
     * @return Nombre del Lugar. 
     */
    @Override
    public String toString() {
        return NombreLugar;
    }

    /**
     * @param obj objeto del tipo ComboLugar
     * @return true o flase
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComboLugar) {
            ComboLugar cbx = (ComboLugar) obj;
            return (cbx.NombreLugar.equals(this.NombreLugar));
        }
        return false;
    }
    
    //Miembros de Clase.
    private int IdLugar;
    private String NombreLugar;
}