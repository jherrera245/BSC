package Model;

/**
 *
 * @author josue
 */
//ClaseLugarControl para el modelo de datos
public class LugarControl{
    //Aqui inician las funciones de la clase.
    //Getters and Setter que en general permitiran obtener y modificar los
    //atributos o miembros de clase.
    
    /**
     * @return identificador, indice o numero de registro
     */
    public int getIdLugarControl() {
        return IdLugarControl;
    }

    /**
     * @param IdLugarControl identificador, indice o numero de registro
     */
    public void setIdLugarControl(int IdLugarControl) {
        this.IdLugarControl = IdLugarControl;
    }

    /**
     * @return Nombre del lugar de control
     */
    public String getNombreLugarControl() {
        return NombreLugarControl;
    }

    /**
     * @param NombreLugarControl Nombre del lugar de control
     */
    public void setNombreLugarControl(String NombreLugarControl) {
        this.NombreLugarControl = NombreLugarControl;
    }

    private int IdLugarControl;
    private String NombreLugarControl;
}
