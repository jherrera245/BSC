package ComboBox;

/**
 *
 * @author josue
 */
//Combobox personalizado para jefes
public class ComboPersona {

    /**
     * Constructor de la Clase
     *
     * @param IdPersona identificador o indice de jefe
     * @param NombrePersona Nombre del Persona
     * @param ApellidoPersona Apellido del Persona
     */
    public ComboPersona(int IdPersona, String NombrePersona, String ApellidoPersona) {
        this.IdPersona = IdPersona;
        this.NombrePersona = NombrePersona;
        this.ApellidoPersona = ApellidoPersona;
    }

    /**
     * @return Identificador o indie de jefe 
     */
    public int getIdPersona() {
        return IdPersona;
    }

    /**
     * @return Nombre del Persona. 
     */
    @Override
    public String toString() {
        return NombrePersona + " " + ApellidoPersona ;
    }

    /**
     * @param obj objeto del tipo ComboPersona
     * @return true o flase
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComboPersona) {
            ComboPersona cbx = (ComboPersona) obj;
            return (cbx.NombrePersona.equals(this.NombrePersona)) && (cbx.ApellidoPersona.equals(this.ApellidoPersona));
        }
        return false;
    }
    
    //Miembros de Clase.
    private int IdPersona;
    private String NombrePersona;
    private String ApellidoPersona;
}
